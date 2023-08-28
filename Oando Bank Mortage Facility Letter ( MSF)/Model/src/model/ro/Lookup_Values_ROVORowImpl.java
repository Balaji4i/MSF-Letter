package model.ro;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Aug 26 09:33:30 IST 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class Lookup_Values_ROVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        LookupValueId,
        LookupTypeId,
        LookupValueCode,
        LookupValueNameDisp,
        LookupValueNameDispTl,
        AccessLevel,
        LookupAddlValue,
        ActiveYn,
        CreatedBy,
        CreationDate,
        LastUpdatedBy,
        LastUpdateDate,
        LastUpdateLogin,
        ParentValueId,
        DisplayOrder;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int LOOKUPVALUEID = AttributesEnum.LookupValueId.index();
    public static final int LOOKUPTYPEID = AttributesEnum.LookupTypeId.index();
    public static final int LOOKUPVALUECODE = AttributesEnum.LookupValueCode.index();
    public static final int LOOKUPVALUENAMEDISP = AttributesEnum.LookupValueNameDisp.index();
    public static final int LOOKUPVALUENAMEDISPTL = AttributesEnum.LookupValueNameDispTl.index();
    public static final int ACCESSLEVEL = AttributesEnum.AccessLevel.index();
    public static final int LOOKUPADDLVALUE = AttributesEnum.LookupAddlValue.index();
    public static final int ACTIVEYN = AttributesEnum.ActiveYn.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATELOGIN = AttributesEnum.LastUpdateLogin.index();
    public static final int PARENTVALUEID = AttributesEnum.ParentValueId.index();
    public static final int DISPLAYORDER = AttributesEnum.DisplayOrder.index();

    /**
     * This is the default constructor (do not remove).
     */
    public Lookup_Values_ROVORowImpl() {
    }
}

