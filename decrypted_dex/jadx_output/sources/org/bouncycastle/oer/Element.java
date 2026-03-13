package org.bouncycastle.oer;

import E1.a;
import com.stub.StubApp;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.oer.OERDefinition;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Element {
    private final Switch aSwitch;
    private final OERDefinition.BaseType baseType;
    private final int block;
    private final List<Element> children;
    private final ASN1Encodable defaultValue;
    private final boolean defaultValuesInChildren;
    private final ElementSupplier elementSupplier;
    private final BigInteger enumValue;
    private final boolean explicit;
    private final boolean extensionsInDefinition;
    private final String label;
    private final BigInteger lowerBound;
    private final boolean mayRecurse;
    private List<Element> optionalChildrenInOrder;
    private final int optionals;
    private Element parent;
    private final Map<String, ElementSupplier> supplierMap;
    private final String typeName;
    private final BigInteger upperBound;
    private List<ASN1Encodable> validSwitchValues;

    public Element(Element element, Element element2) {
        this.baseType = element.baseType;
        ArrayList arrayList = new ArrayList(element.children);
        this.children = arrayList;
        this.explicit = element.explicit;
        this.label = element.label;
        this.lowerBound = element.lowerBound;
        this.upperBound = element.upperBound;
        this.extensionsInDefinition = element.extensionsInDefinition;
        this.enumValue = element.enumValue;
        this.defaultValue = element.defaultValue;
        this.aSwitch = element.aSwitch;
        this.validSwitchValues = element.validSwitchValues;
        this.elementSupplier = element.elementSupplier;
        this.mayRecurse = element.mayRecurse;
        this.typeName = element.typeName;
        this.supplierMap = element.supplierMap;
        this.parent = element2;
        this.block = element.block;
        this.optionals = element.optionals;
        this.defaultValuesInChildren = element.defaultValuesInChildren;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Element) it.next()).parent = this;
        }
    }

    public static Element expandDeferredDefinition(Element element, Element element2) {
        ElementSupplier elementSupplier = element.elementSupplier;
        if (elementSupplier != null) {
            element = elementSupplier.build();
            if (element.getParent() != element2) {
                return new Element(element, element2);
            }
        }
        return element;
    }

    public String appendLabel(String str) {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(1557));
        sb2.append(getLabel() == null ? "" : getLabel());
        return a.n(sb2, isExplicit() ? StubApp.getString2(33072) : "", StubApp.getString2(1558), str);
    }

    public boolean canBeNegative() {
        return getLowerBound() != null && BigInteger.ZERO.compareTo(getLowerBound()) > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Element element = (Element) obj;
            if (this.explicit != element.explicit || this.extensionsInDefinition != element.extensionsInDefinition || this.defaultValuesInChildren != element.defaultValuesInChildren || this.mayRecurse != element.mayRecurse || this.optionals != element.optionals || this.block != element.block || this.baseType != element.baseType) {
                return false;
            }
            List<Element> list = this.children;
            if (list == null ? element.children != null : !list.equals(element.children)) {
                return false;
            }
            String str = this.label;
            if (str == null ? element.label != null : !str.equals(element.label)) {
                return false;
            }
            BigInteger bigInteger = this.lowerBound;
            if (bigInteger == null ? element.lowerBound != null : !bigInteger.equals(element.lowerBound)) {
                return false;
            }
            BigInteger bigInteger2 = this.upperBound;
            if (bigInteger2 == null ? element.upperBound != null : !bigInteger2.equals(element.upperBound)) {
                return false;
            }
            BigInteger bigInteger3 = this.enumValue;
            if (bigInteger3 == null ? element.enumValue != null : !bigInteger3.equals(element.enumValue)) {
                return false;
            }
            ASN1Encodable aSN1Encodable = this.defaultValue;
            if (aSN1Encodable == null ? element.defaultValue != null : !aSN1Encodable.equals(element.defaultValue)) {
                return false;
            }
            Switch r22 = this.aSwitch;
            if (r22 == null ? element.aSwitch != null : !r22.equals(element.aSwitch)) {
                return false;
            }
            List<Element> list2 = this.optionalChildrenInOrder;
            if (list2 == null ? element.optionalChildrenInOrder != null : !list2.equals(element.optionalChildrenInOrder)) {
                return false;
            }
            List<ASN1Encodable> list3 = this.validSwitchValues;
            if (list3 == null ? element.validSwitchValues != null : !list3.equals(element.validSwitchValues)) {
                return false;
            }
            ElementSupplier elementSupplier = this.elementSupplier;
            if (elementSupplier == null ? element.elementSupplier != null : !elementSupplier.equals(element.elementSupplier)) {
                return false;
            }
            String str2 = this.typeName;
            if (str2 == null ? element.typeName != null : !str2.equals(element.typeName)) {
                return false;
            }
            Map<String, ElementSupplier> map = this.supplierMap;
            Map<String, ElementSupplier> map2 = element.supplierMap;
            if (map != null) {
                return !map.equals(map2);
            }
            if (map2 != null) {
                return true;
            }
        }
        return false;
    }

    public OERDefinition.BaseType getBaseType() {
        return this.baseType;
    }

    public int getBlock() {
        return this.block;
    }

    public List<Element> getChildren() {
        return this.children;
    }

    public ASN1Encodable getDefaultValue() {
        return this.defaultValue;
    }

    public String getDerivedTypeName() {
        String str = this.typeName;
        return str != null ? str : this.baseType.name();
    }

    public ElementSupplier getElementSupplier() {
        return this.elementSupplier;
    }

    public BigInteger getEnumValue() {
        return this.enumValue;
    }

    public Element getFirstChid() {
        return getChildren().get(0);
    }

    public String getLabel() {
        return this.label;
    }

    public BigInteger getLowerBound() {
        return this.lowerBound;
    }

    public List<Element> getOptionalChildrenInOrder() {
        return this.optionalChildrenInOrder;
    }

    public int getOptionals() {
        return this.optionals;
    }

    public Element getParent() {
        return this.parent;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public BigInteger getUpperBound() {
        return this.upperBound;
    }

    public List<ASN1Encodable> getValidSwitchValues() {
        return this.validSwitchValues;
    }

    public Switch getaSwitch() {
        return this.aSwitch;
    }

    public boolean hasDefaultChildren() {
        return this.defaultValuesInChildren;
    }

    public boolean hasPopulatedExtension() {
        return this.extensionsInDefinition;
    }

    public int hashCode() {
        OERDefinition.BaseType baseType = this.baseType;
        int hashCode = (baseType != null ? baseType.hashCode() : 0) * 31;
        List<Element> list = this.children;
        int hashCode2 = (((hashCode + (list != null ? list.hashCode() : 0)) * 31) + (this.explicit ? 1 : 0)) * 31;
        String str = this.label;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        BigInteger bigInteger = this.lowerBound;
        int hashCode4 = (hashCode3 + (bigInteger != null ? bigInteger.hashCode() : 0)) * 31;
        BigInteger bigInteger2 = this.upperBound;
        int hashCode5 = (((hashCode4 + (bigInteger2 != null ? bigInteger2.hashCode() : 0)) * 31) + (this.extensionsInDefinition ? 1 : 0)) * 31;
        BigInteger bigInteger3 = this.enumValue;
        int hashCode6 = (hashCode5 + (bigInteger3 != null ? bigInteger3.hashCode() : 0)) * 31;
        ASN1Encodable aSN1Encodable = this.defaultValue;
        int hashCode7 = (hashCode6 + (aSN1Encodable != null ? aSN1Encodable.hashCode() : 0)) * 31;
        Switch r22 = this.aSwitch;
        int hashCode8 = (((hashCode7 + (r22 != null ? r22.hashCode() : 0)) * 31) + (this.defaultValuesInChildren ? 1 : 0)) * 31;
        List<Element> list2 = this.optionalChildrenInOrder;
        int hashCode9 = (hashCode8 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<ASN1Encodable> list3 = this.validSwitchValues;
        int hashCode10 = (hashCode9 + (list3 != null ? list3.hashCode() : 0)) * 31;
        ElementSupplier elementSupplier = this.elementSupplier;
        int hashCode11 = (((hashCode10 + (elementSupplier != null ? elementSupplier.hashCode() : 0)) * 31) + (this.mayRecurse ? 1 : 0)) * 31;
        String str2 = this.typeName;
        int hashCode12 = (hashCode11 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map<String, ElementSupplier> map = this.supplierMap;
        return ((((hashCode12 + (map != null ? map.hashCode() : 0)) * 31) + this.optionals) * 31) + this.block;
    }

    public int intBytesForRange() {
        if (getLowerBound() != null && getUpperBound() != null) {
            int i3 = 1;
            if (!BigInteger.ZERO.equals(getLowerBound())) {
                int i10 = 0;
                int i11 = 1;
                while (true) {
                    BigInteger[][] bigIntegerArr = OERDefinition.sIntRange;
                    if (i10 >= bigIntegerArr.length) {
                        break;
                    }
                    if (getLowerBound().compareTo(bigIntegerArr[i10][0]) >= 0 && getUpperBound().compareTo(bigIntegerArr[i10][1]) < 0) {
                        return -i11;
                    }
                    i10++;
                    i11 *= 2;
                }
            } else {
                int i12 = 0;
                while (true) {
                    BigInteger[] bigIntegerArr2 = OERDefinition.uIntMax;
                    if (i12 >= bigIntegerArr2.length) {
                        break;
                    }
                    if (getUpperBound().compareTo(bigIntegerArr2[i12]) < 0) {
                        return i3;
                    }
                    i12++;
                    i3 *= 2;
                }
            }
        }
        return 0;
    }

    public boolean isExplicit() {
        return this.explicit;
    }

    public boolean isExtensionsInDefinition() {
        return this.extensionsInDefinition;
    }

    public boolean isFixedLength() {
        return getLowerBound() != null && getLowerBound().equals(getUpperBound());
    }

    public boolean isLowerRangeZero() {
        return BigInteger.ZERO.equals(getLowerBound());
    }

    public boolean isMayRecurse() {
        return this.mayRecurse;
    }

    public boolean isUnbounded() {
        return getUpperBound() == null && getLowerBound() == null;
    }

    public boolean isUnsignedWithRange() {
        return isLowerRangeZero() && getUpperBound() != null && BigInteger.ZERO.compareTo(getUpperBound()) < 0;
    }

    public List<Element> optionalOrDefaultChildrenInOrder() {
        List<Element> optionalChildrenInOrder;
        synchronized (this) {
            try {
                if (getOptionalChildrenInOrder() == null) {
                    ArrayList arrayList = new ArrayList();
                    for (Element element : getChildren()) {
                        if (element.isExplicit() && element.getDefaultValue() == null) {
                        }
                        arrayList.add(element);
                    }
                    this.optionalChildrenInOrder = Collections.unmodifiableList(arrayList);
                }
                optionalChildrenInOrder = getOptionalChildrenInOrder();
            } catch (Throwable th) {
                throw th;
            }
        }
        return optionalChildrenInOrder;
    }

    public String rangeExpression() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(2830));
        sb2.append(getLowerBound() != null ? getLowerBound().toString() : StubApp.getString2(33073));
        sb2.append(StubApp.getString2(33074));
        return AbstractC1482f.k(sb2, getUpperBound() != null ? getUpperBound().toString() : StubApp.getString2(33075), StubApp.getString2(74));
    }

    public ElementSupplier resolveSupplier() {
        if (this.supplierMap.containsKey(this.label)) {
            return this.supplierMap.get(this.label);
        }
        Element element = this.parent;
        if (element != null) {
            return element.resolveSupplier(this.label);
        }
        throw new IllegalStateException(StubApp.getString2(33076) + this.label);
    }

    public String toString() {
        return StubApp.getString2(1557) + this.typeName + StubApp.getString2(397) + this.baseType.name() + StubApp.getString2(11080) + getLabel() + StubApp.getString2(10641);
    }

    public Element(OERDefinition.BaseType baseType, List<Element> list, boolean z2, String str, BigInteger bigInteger, BigInteger bigInteger2, boolean z10, BigInteger bigInteger3, ASN1Encodable aSN1Encodable, Switch r11, List<ASN1Encodable> list2, ElementSupplier elementSupplier, boolean z11, String str2, Map<String, ElementSupplier> map, int i3, int i10, boolean z12) {
        this.baseType = baseType;
        this.children = list;
        this.explicit = z2;
        this.label = str;
        this.lowerBound = bigInteger;
        this.upperBound = bigInteger2;
        this.extensionsInDefinition = z10;
        this.enumValue = bigInteger3;
        this.defaultValue = aSN1Encodable;
        this.aSwitch = r11;
        this.validSwitchValues = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.elementSupplier = elementSupplier;
        this.mayRecurse = z11;
        this.typeName = str2;
        this.block = i3;
        this.optionals = i10;
        this.defaultValuesInChildren = z12;
        if (map == null) {
            this.supplierMap = Collections.EMPTY_MAP;
        } else {
            this.supplierMap = map;
        }
        Iterator<Element> it = list.iterator();
        while (it.hasNext()) {
            it.next().parent = this;
        }
    }

    public ElementSupplier resolveSupplier(String str) {
        String n10 = a.n(new StringBuilder(), this.label, StubApp.getString2(1), str);
        if (this.supplierMap.containsKey(n10)) {
            return this.supplierMap.get(n10);
        }
        Element element = this.parent;
        if (element != null) {
            return element.resolveSupplier(n10);
        }
        throw new IllegalStateException(a.j(StubApp.getString2(33076), n10));
    }
}
