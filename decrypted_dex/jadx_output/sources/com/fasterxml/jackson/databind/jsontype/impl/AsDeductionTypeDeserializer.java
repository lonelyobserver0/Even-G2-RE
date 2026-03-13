package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.stub.StubApp;
import java.io.IOException;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AsDeductionTypeDeserializer extends AsPropertyTypeDeserializer {
    private static final BitSet EMPTY_CLASS_FINGERPRINT = new BitSet(0);
    private final Map<String, Integer> fieldBitIndex;
    private final Map<BitSet, String> subtypeFingerprints;

    public AsDeductionTypeDeserializer(JavaType javaType, TypeIdResolver typeIdResolver, JavaType javaType2, DeserializationConfig deserializationConfig, Collection<NamedType> collection) {
        super(javaType, typeIdResolver, null, false, javaType2, null);
        this.fieldBitIndex = new HashMap();
        this.subtypeFingerprints = buildFingerprints(deserializationConfig, collection);
    }

    private static void prune(List<BitSet> list, int i3) {
        Iterator<BitSet> it = list.iterator();
        while (it.hasNext()) {
            if (!it.next().get(i3)) {
                it.remove();
            }
        }
    }

    public Map<BitSet, String> buildFingerprints(DeserializationConfig deserializationConfig, Collection<NamedType> collection) {
        boolean isEnabled = deserializationConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        HashMap hashMap = new HashMap();
        int i3 = 0;
        for (NamedType namedType : collection) {
            List<BeanPropertyDefinition> findProperties = deserializationConfig.introspect(deserializationConfig.getTypeFactory().constructType(namedType.getType())).findProperties();
            BitSet bitSet = new BitSet(findProperties.size() + i3);
            Iterator<BeanPropertyDefinition> it = findProperties.iterator();
            while (it.hasNext()) {
                String name = it.next().getName();
                if (isEnabled) {
                    name = name.toLowerCase();
                }
                Integer num = this.fieldBitIndex.get(name);
                if (num == null) {
                    num = Integer.valueOf(i3);
                    this.fieldBitIndex.put(name, Integer.valueOf(i3));
                    i3++;
                }
                bitSet.set(num.intValue());
            }
            String str = (String) hashMap.put(bitSet, namedType.getType().getName());
            if (str != null) {
                throw new IllegalStateException(AbstractC1482f.j(StubApp.getString2(10858), str, StubApp.getString2(3542), namedType.getType().getName(), StubApp.getString2(10859)));
            }
        }
        return hashMap;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer, com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public Object deserializeTypedFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String str;
        JsonToken currentToken = jsonParser.currentToken();
        if (currentToken == JsonToken.START_OBJECT) {
            currentToken = jsonParser.nextToken();
        } else if (currentToken != JsonToken.FIELD_NAME) {
            return _deserializeTypedUsingDefaultImpl(jsonParser, deserializationContext, null, StubApp.getString2(10860));
        }
        if (currentToken == JsonToken.END_OBJECT && (str = this.subtypeFingerprints.get(EMPTY_CLASS_FINGERPRINT)) != null) {
            return _deserializeTypedForId(jsonParser, deserializationContext, null, str);
        }
        LinkedList linkedList = new LinkedList(this.subtypeFingerprints.keySet());
        TokenBuffer bufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        boolean isEnabled = deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        while (currentToken == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.currentName();
            if (isEnabled) {
                currentName = currentName.toLowerCase();
            }
            bufferForInputBuffering.copyCurrentStructure(jsonParser);
            Integer num = this.fieldBitIndex.get(currentName);
            if (num != null) {
                prune(linkedList, num.intValue());
                if (linkedList.size() == 1) {
                    return _deserializeTypedForId(jsonParser, deserializationContext, bufferForInputBuffering, this.subtypeFingerprints.get(linkedList.get(0)));
                }
            }
            currentToken = jsonParser.nextToken();
        }
        return _deserializeTypedUsingDefaultImpl(jsonParser, deserializationContext, bufferForInputBuffering, String.format(StubApp.getString2(10861), ClassUtil.getTypeDescription(this._baseType), Integer.valueOf(linkedList.size())));
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer, com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public TypeDeserializer forProperty(BeanProperty beanProperty) {
        return beanProperty == this._property ? this : new AsDeductionTypeDeserializer(this, beanProperty);
    }

    public AsDeductionTypeDeserializer(AsDeductionTypeDeserializer asDeductionTypeDeserializer, BeanProperty beanProperty) {
        super(asDeductionTypeDeserializer, beanProperty);
        this.fieldBitIndex = asDeductionTypeDeserializer.fieldBitIndex;
        this.subtypeFingerprints = asDeductionTypeDeserializer.subtypeFingerprints;
    }
}
