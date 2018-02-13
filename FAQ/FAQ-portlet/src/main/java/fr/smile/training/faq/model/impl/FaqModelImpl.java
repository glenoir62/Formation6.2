package fr.smile.training.faq.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import fr.smile.training.faq.model.Faq;
import fr.smile.training.faq.model.FaqModel;
import fr.smile.training.faq.model.FaqSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Faq service. Represents a row in the &quot;Faq&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link fr.smile.training.faq.model.FaqModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FaqImpl}.
 * </p>
 *
 * @author Guillaume Lenoir
 * @see FaqImpl
 * @see fr.smile.training.faq.model.Faq
 * @see fr.smile.training.faq.model.FaqModel
 * @generated
 */
@JSON(strict = true)
public class FaqModelImpl extends BaseModelImpl<Faq> implements FaqModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a faq model instance should use the {@link fr.smile.training.faq.model.Faq} interface instead.
     */
    public static final String TABLE_NAME = "Faq";
    public static final Object[][] TABLE_COLUMNS = {
            { "entryId", Types.BIGINT },
            { "companyId", Types.BIGINT },
            { "groupId", Types.BIGINT },
            { "question", Types.VARCHAR },
            { "answer", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table Faq (entryId LONG not null primary key,companyId LONG,groupId LONG,question VARCHAR(75) null,answer VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table Faq";
    public static final String ORDER_BY_JPQL = " ORDER BY faq.entryId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY Faq.entryId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.fr.smile.training.faq.model.Faq"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.fr.smile.training.faq.model.Faq"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.fr.smile.training.faq.model.Faq"));
    private static ClassLoader _classLoader = Faq.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] { Faq.class };
    private long _entryId;
    private long _companyId;
    private long _groupId;
    private String _question;
    private String _answer;
    private Faq _escapedModel;

    public FaqModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static Faq toModel(FaqSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        Faq model = new FaqImpl();

        model.setEntryId(soapModel.getEntryId());
        model.setCompanyId(soapModel.getCompanyId());
        model.setGroupId(soapModel.getGroupId());
        model.setQuestion(soapModel.getQuestion());
        model.setAnswer(soapModel.getAnswer());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<Faq> toModels(FaqSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<Faq> models = new ArrayList<Faq>(soapModels.length);

        for (FaqSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public long getPrimaryKey() {
        return _entryId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setEntryId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _entryId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return Faq.class;
    }

    @Override
    public String getModelClassName() {
        return Faq.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("entryId", getEntryId());
        attributes.put("companyId", getCompanyId());
        attributes.put("groupId", getGroupId());
        attributes.put("question", getQuestion());
        attributes.put("answer", getAnswer());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long entryId = (Long) attributes.get("entryId");

        if (entryId != null) {
            setEntryId(entryId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        String question = (String) attributes.get("question");

        if (question != null) {
            setQuestion(question);
        }

        String answer = (String) attributes.get("answer");

        if (answer != null) {
            setAnswer(answer);
        }
    }

    @JSON
    @Override
    public long getEntryId() {
        return _entryId;
    }

    @Override
    public void setEntryId(long entryId) {
        _entryId = entryId;
    }

    @JSON
    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    @JSON
    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    @JSON
    @Override
    public String getQuestion() {
        if (_question == null) {
            return StringPool.BLANK;
        } else {
            return _question;
        }
    }

    @Override
    public void setQuestion(String question) {
        _question = question;
    }

    @JSON
    @Override
    public String getAnswer() {
        if (_answer == null) {
            return StringPool.BLANK;
        } else {
            return _answer;
        }
    }

    @Override
    public void setAnswer(String answer) {
        _answer = answer;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
            Faq.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Faq toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Faq) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        FaqImpl faqImpl = new FaqImpl();

        faqImpl.setEntryId(getEntryId());
        faqImpl.setCompanyId(getCompanyId());
        faqImpl.setGroupId(getGroupId());
        faqImpl.setQuestion(getQuestion());
        faqImpl.setAnswer(getAnswer());

        faqImpl.resetOriginalValues();

        return faqImpl;
    }

    @Override
    public int compareTo(Faq faq) {
        long primaryKey = faq.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Faq)) {
            return false;
        }

        Faq faq = (Faq) obj;

        long primaryKey = faq.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<Faq> toCacheModel() {
        FaqCacheModel faqCacheModel = new FaqCacheModel();

        faqCacheModel.entryId = getEntryId();

        faqCacheModel.companyId = getCompanyId();

        faqCacheModel.groupId = getGroupId();

        faqCacheModel.question = getQuestion();

        String question = faqCacheModel.question;

        if ((question != null) && (question.length() == 0)) {
            faqCacheModel.question = null;
        }

        faqCacheModel.answer = getAnswer();

        String answer = faqCacheModel.answer;

        if ((answer != null) && (answer.length() == 0)) {
            faqCacheModel.answer = null;
        }

        return faqCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{entryId=");
        sb.append(getEntryId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", question=");
        sb.append(getQuestion());
        sb.append(", answer=");
        sb.append(getAnswer());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(19);

        sb.append("<model><model-name>");
        sb.append("fr.smile.training.faq.model.Faq");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>entryId</column-name><column-value><![CDATA[");
        sb.append(getEntryId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>question</column-name><column-value><![CDATA[");
        sb.append(getQuestion());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>answer</column-name><column-value><![CDATA[");
        sb.append(getAnswer());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
