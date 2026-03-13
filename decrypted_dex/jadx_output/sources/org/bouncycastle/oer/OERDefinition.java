package org.bouncycastle.oer;

import com.stub.StubApp;
import i2.u;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class OERDefinition {
    static final BigInteger[] uIntMax = {new BigInteger(StubApp.getString2(31109)), new BigInteger(StubApp.getString2(33098)), new BigInteger(StubApp.getString2(33099)), new BigInteger(StubApp.getString2(33100))};
    static final BigInteger[][] sIntRange = {new BigInteger[]{new BigInteger(StubApp.getString2(33101)), new BigInteger(StubApp.getString2(33102))}, new BigInteger[]{new BigInteger(StubApp.getString2(33103)), new BigInteger(StubApp.getString2(33104))}, new BigInteger[]{new BigInteger(StubApp.getString2(33105)), new BigInteger(StubApp.getString2(33106))}, new BigInteger[]{new BigInteger(StubApp.getString2(33107)), new BigInteger(StubApp.getString2(33108))}};

    public enum BaseType {
        SEQ,
        SEQ_OF,
        CHOICE,
        ENUM,
        INT,
        OCTET_STRING,
        OPAQUE,
        UTF8_STRING,
        BIT_STRING,
        NULL,
        EXTENSION,
        ENUM_ITEM,
        BOOLEAN,
        IS0646String,
        PrintableString,
        NumericString,
        BMPString,
        UniversalString,
        IA5String,
        VisibleString,
        Switch,
        Supplier
    }

    public static class Builder {
        protected Switch aSwitch;
        protected final BaseType baseType;
        protected int block;
        protected ASN1Encodable defaultValue;
        protected ElementSupplier elementSupplier;
        protected BigInteger enumValue;
        protected Boolean inScope;
        protected String label;
        protected BigInteger lowerBound;
        protected boolean mayRecurse;
        protected Builder placeholderValue;
        protected String typeName;
        protected BigInteger upperBound;
        protected ArrayList<Builder> children = new ArrayList<>();
        protected boolean explicit = true;
        protected ArrayList<ASN1Encodable> validSwitchValues = new ArrayList<>();
        protected Map<String, ElementSupplier> supplierMap = new HashMap();
        private final ItemProvider defaultItemProvider = new ItemProvider() { // from class: org.bouncycastle.oer.OERDefinition.Builder.1
            @Override // org.bouncycastle.oer.OERDefinition.ItemProvider
            public Builder existingChild(int i3, Builder builder) {
                return builder.copy(Builder.this.defaultItemProvider);
            }
        };

        public Builder(BaseType baseType) {
            this.baseType = baseType;
        }

        public void addExtensions(Builder builder, ExtensionList extensionList) {
            if (extensionList.isEmpty()) {
                Builder builder2 = new Builder(BaseType.EXTENSION);
                builder2.block = extensionList.block;
                builder.children.add(builder2);
                return;
            }
            for (Object obj : extensionList) {
                if (obj instanceof OptionalList) {
                    addOptionals(builder, extensionList.block, (OptionalList) obj);
                } else {
                    Builder wrap = wrap(true, obj);
                    wrap.block = extensionList.block;
                    builder.children.add(wrap);
                }
            }
        }

        public void addOptionals(Builder builder, int i3, OptionalList optionalList) {
            for (Object obj : optionalList) {
                if (obj instanceof ExtensionList) {
                    addExtensions(builder, (ExtensionList) obj);
                } else {
                    Builder wrap = wrap(false, obj);
                    wrap.block = i3;
                    builder.children.add(wrap);
                }
            }
        }

        public Builder block(int i3) {
            Builder copy = copy();
            copy.block = i3;
            return copy;
        }

        public Element build() {
            ArrayList<ASN1Encodable> arrayList;
            Map<String, ElementSupplier> map;
            ArrayList arrayList2 = new ArrayList();
            boolean z2 = false;
            if (this.baseType == BaseType.ENUM) {
                HashSet hashSet = new HashSet();
                int i3 = 0;
                for (int i10 = 0; i10 < this.children.size(); i10++) {
                    Builder builder = this.children.get(i10);
                    if (builder.enumValue == null) {
                        builder.enumValue = BigInteger.valueOf(i3);
                        i3++;
                    }
                    if (hashSet.contains(builder.enumValue)) {
                        throw new IllegalStateException(u.p(i10, StubApp.getString2(33095)));
                    }
                    hashSet.add(builder.enumValue);
                }
            }
            Iterator<Builder> it = this.children.iterator();
            boolean z10 = false;
            int i11 = 0;
            boolean z11 = false;
            while (it.hasNext()) {
                Builder next = it.next();
                if (!z10 && next.block > 0) {
                    z10 = true;
                }
                if (!next.explicit) {
                    i11++;
                }
                if (!z11 && next.defaultValue != null) {
                    z11 = true;
                }
                arrayList2.add(next.build());
            }
            BaseType baseType = this.baseType;
            ASN1Encodable aSN1Encodable = this.defaultValue;
            if (aSN1Encodable == null && this.explicit) {
                z2 = true;
            }
            String str = this.label;
            BigInteger bigInteger = this.lowerBound;
            BigInteger bigInteger2 = this.upperBound;
            BigInteger bigInteger3 = this.enumValue;
            Switch r11 = this.aSwitch;
            if (this.validSwitchValues.isEmpty()) {
                arrayList = null;
                map = null;
            } else {
                arrayList = this.validSwitchValues;
                map = null;
            }
            ElementSupplier elementSupplier = this.elementSupplier;
            Map<String, ElementSupplier> map2 = map;
            boolean z12 = this.mayRecurse;
            Map<String, ElementSupplier> map3 = map2;
            String str2 = this.typeName;
            if (!this.supplierMap.isEmpty()) {
                map3 = this.supplierMap;
            }
            return new Element(baseType, arrayList2, z2, str, bigInteger, bigInteger2, z10, bigInteger3, aSN1Encodable, r11, arrayList, elementSupplier, z12, str2, map3, this.block, i11, z11);
        }

        public Builder copy() {
            return copy(this.defaultItemProvider);
        }

        public Builder decodeSwitch(Switch r22) {
            Builder copy = copy();
            copy.aSwitch = r22;
            return copy;
        }

        public Builder defaultValue(ASN1Encodable aSN1Encodable) {
            Builder copy = copy();
            copy.defaultValue = aSN1Encodable;
            return copy;
        }

        public Builder elementSupplier(ElementSupplier elementSupplier) {
            Builder copy = copy();
            copy.elementSupplier = elementSupplier;
            return copy;
        }

        public Builder enumValue(BigInteger bigInteger) {
            Builder copy = copy();
            this.enumValue = bigInteger;
            return copy;
        }

        public Builder explicit(boolean z2) {
            Builder copy = copy();
            copy.explicit = z2;
            return copy;
        }

        public Builder fixedSize(long j) {
            Builder copy = copy();
            copy.upperBound = BigInteger.valueOf(j);
            copy.lowerBound = BigInteger.valueOf(j);
            return copy;
        }

        public Builder inScope(boolean z2) {
            Builder copy = copy();
            copy.inScope = Boolean.valueOf(z2);
            return copy;
        }

        public Builder items(Object... objArr) {
            Builder copy = copy();
            for (int i3 = 0; i3 != objArr.length; i3++) {
                Object obj = objArr[i3];
                if (obj instanceof ExtensionList) {
                    addExtensions(copy, (ExtensionList) obj);
                } else if (obj instanceof OptionalList) {
                    addOptionals(copy, copy.block, (OptionalList) obj);
                } else if (obj.getClass().isArray()) {
                    int i10 = 0;
                    while (true) {
                        Object[] objArr2 = (Object[]) obj;
                        if (i10 < objArr2.length) {
                            copy.children.add(wrap(true, objArr2[i10]));
                            i10++;
                        }
                    }
                } else {
                    copy.children.add(wrap(true, obj));
                }
            }
            return copy;
        }

        public Builder label(String str) {
            Builder copy = copy();
            copy.label = str;
            return copy;
        }

        public Builder labelPrefix(String str) {
            Builder copy = copy();
            StringBuilder n10 = AbstractC1482f.n(str, StubApp.getString2(397));
            n10.append(this.label);
            copy.label = n10.toString();
            return copy;
        }

        public Builder limitScopeTo(String... strArr) {
            Builder copy = copy();
            HashSet hashSet = new HashSet();
            hashSet.addAll(Arrays.asList(strArr));
            ArrayList<Builder> arrayList = new ArrayList<>();
            Iterator<Builder> it = this.children.iterator();
            while (it.hasNext()) {
                Builder next = it.next();
                arrayList.add(next.copy().inScope(hashSet.contains(next.label)));
            }
            copy.children = arrayList;
            return copy;
        }

        public Builder mayRecurse(boolean z2) {
            Builder copy = copy();
            copy.mayRecurse = z2;
            return copy;
        }

        public Builder range(long j, long j3, ASN1Encodable aSN1Encodable) {
            Builder copy = copy();
            copy.lowerBound = BigInteger.valueOf(j);
            copy.upperBound = BigInteger.valueOf(j3);
            copy.defaultValue = aSN1Encodable;
            return copy;
        }

        public Builder rangeToMAXFrom(long j) {
            Builder copy = copy();
            copy.lowerBound = BigInteger.valueOf(j);
            copy.upperBound = null;
            return copy;
        }

        public Builder rangeZeroTo(long j) {
            Builder copy = copy();
            copy.upperBound = BigInteger.valueOf(j);
            copy.lowerBound = BigInteger.ZERO;
            return copy;
        }

        public Builder replaceChild(final int i3, final Builder builder) {
            return copy(new ItemProvider() { // from class: org.bouncycastle.oer.OERDefinition.Builder.2
                @Override // org.bouncycastle.oer.OERDefinition.ItemProvider
                public Builder existingChild(int i10, Builder builder2) {
                    return i3 == i10 ? builder : builder2;
                }
            });
        }

        public Builder typeName(String str) {
            Builder copy = copy();
            copy.typeName = str;
            if (copy.label == null) {
                copy.label = str;
            }
            return copy;
        }

        public Builder unbounded() {
            Builder copy = copy();
            copy.lowerBound = null;
            copy.upperBound = null;
            return copy;
        }

        public Builder validSwitchValue(ASN1Encodable... aSN1EncodableArr) {
            Builder copy = copy();
            copy.validSwitchValues.addAll(Arrays.asList(aSN1EncodableArr));
            return copy;
        }

        public Builder wrap(boolean z2, Object obj) {
            if (obj instanceof Builder) {
                return ((Builder) obj).explicit(z2);
            }
            if (obj instanceof BaseType) {
                return new Builder((BaseType) obj).explicit(z2);
            }
            if (obj instanceof String) {
                return OERDefinition.enumItem((String) obj);
            }
            throw new IllegalStateException(StubApp.getString2(33096));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Builder copy(ItemProvider itemProvider) {
            Builder builder = new Builder(this.baseType);
            Iterator<Builder> it = this.children.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                builder.children.add(itemProvider.existingChild(i3, it.next()));
                i3++;
            }
            builder.explicit = this.explicit;
            builder.label = this.label;
            builder.upperBound = this.upperBound;
            builder.lowerBound = this.lowerBound;
            builder.defaultValue = this.defaultValue;
            builder.enumValue = this.enumValue;
            builder.inScope = this.inScope;
            builder.aSwitch = this.aSwitch;
            builder.validSwitchValues = new ArrayList<>(this.validSwitchValues);
            builder.elementSupplier = this.elementSupplier;
            builder.mayRecurse = this.mayRecurse;
            builder.typeName = this.typeName;
            builder.supplierMap = new HashMap(this.supplierMap);
            builder.block = this.block;
            return builder;
        }

        public Builder range(BigInteger bigInteger, BigInteger bigInteger2) {
            Builder copy = copy();
            copy.lowerBound = bigInteger;
            copy.upperBound = bigInteger2;
            return copy;
        }
    }

    public static class ExtensionList extends ArrayList<Object> {
        protected final int block;

        public ExtensionList(int i3, List<Object> list) {
            this.block = i3;
            addAll(list);
        }
    }

    public interface ItemProvider {
        Builder existingChild(int i3, Builder builder);
    }

    public static class MutableBuilder extends Builder {
        private boolean frozen;

        public MutableBuilder(BaseType baseType) {
            super(baseType);
            this.frozen = false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public MutableBuilder addItemsAndFreeze(Builder... builderArr) {
            if (this.frozen) {
                throw new IllegalStateException(StubApp.getString2(33097));
            }
            for (int i3 = 0; i3 != builderArr.length; i3++) {
                Object[] objArr = builderArr[i3];
                if (objArr.getClass().isArray()) {
                    for (Object obj : objArr) {
                        this.children.add(wrap(true, obj));
                    }
                } else {
                    this.children.add(wrap(true, objArr));
                }
            }
            this.frozen = true;
            return this;
        }

        @Override // org.bouncycastle.oer.OERDefinition.Builder
        public MutableBuilder label(String str) {
            this.label = str;
            return this;
        }
    }

    public static class OptionalList extends ArrayList<Object> {
        public OptionalList(List<Object> list) {
            addAll(list);
        }
    }

    public static Builder aSwitch(Switch r22) {
        return new Builder(BaseType.Switch).decodeSwitch(r22);
    }

    public static Builder bitString(long j) {
        return new Builder(BaseType.BIT_STRING).fixedSize(j);
    }

    public static Builder bool() {
        return new Builder(BaseType.BOOLEAN);
    }

    public static Builder choice(Object... objArr) {
        return new Builder(BaseType.CHOICE).items(objArr);
    }

    public static Builder deferred(ElementSupplier elementSupplier) {
        return new Builder(BaseType.Supplier).elementSupplier(elementSupplier);
    }

    public static Builder enumItem(String str) {
        return new Builder(BaseType.ENUM_ITEM).label(str);
    }

    public static Builder enumeration(Object... objArr) {
        return new Builder(BaseType.ENUM).items(objArr);
    }

    public static ExtensionList extension(int i3, Object... objArr) {
        return new ExtensionList(i3, Arrays.asList(objArr));
    }

    public static Builder ia5String() {
        return new Builder(BaseType.IA5String);
    }

    public static Builder integer() {
        return new Builder(BaseType.INT);
    }

    public static Builder nullValue() {
        return new Builder(BaseType.NULL);
    }

    public static Builder octets() {
        return new Builder(BaseType.OCTET_STRING).unbounded();
    }

    public static Builder opaque() {
        return new Builder(BaseType.OPAQUE);
    }

    public static List<Object> optional(Object... objArr) {
        return new OptionalList(Arrays.asList(objArr));
    }

    public static Builder placeholder() {
        return new Builder(null);
    }

    public static Builder seq() {
        return new Builder(BaseType.SEQ);
    }

    public static Builder seqof(Object... objArr) {
        return new Builder(BaseType.SEQ_OF).items(objArr);
    }

    public static Builder utf8String() {
        return new Builder(BaseType.UTF8_STRING);
    }

    public static Builder enumItem(String str, BigInteger bigInteger) {
        return new Builder(BaseType.ENUM_ITEM).enumValue(bigInteger).label(str);
    }

    public static ExtensionList extension(Object... objArr) {
        return new ExtensionList(1, Arrays.asList(objArr));
    }

    public static Builder integer(long j) {
        return new Builder(BaseType.INT).defaultValue(new ASN1Integer(j));
    }

    public static Builder octets(int i3) {
        return new Builder(BaseType.OCTET_STRING).fixedSize(i3);
    }

    public static Builder seq(Object... objArr) {
        return new Builder(BaseType.SEQ).items(objArr);
    }

    public static Builder utf8String(int i3) {
        return new Builder(BaseType.UTF8_STRING).rangeToMAXFrom(i3);
    }

    public static Builder integer(long j, long j3) {
        return new Builder(BaseType.INT).range(BigInteger.valueOf(j), BigInteger.valueOf(j3));
    }

    public static Builder octets(int i3, int i10) {
        return new Builder(BaseType.OCTET_STRING).range(BigInteger.valueOf(i3), BigInteger.valueOf(i10));
    }

    public static Builder utf8String(int i3, int i10) {
        return new Builder(BaseType.UTF8_STRING).range(BigInteger.valueOf(i3), BigInteger.valueOf(i10));
    }

    public static Builder integer(long j, long j3, ASN1Encodable aSN1Encodable) {
        return new Builder(BaseType.INT).range(j, j3, aSN1Encodable);
    }

    public static Builder integer(BigInteger bigInteger, BigInteger bigInteger2) {
        return new Builder(BaseType.INT).range(bigInteger, bigInteger2);
    }
}
