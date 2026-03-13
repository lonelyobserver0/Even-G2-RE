package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.io.ContentReference;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class JsonLocationInstantiator extends ValueInstantiator.Base {
    public JsonLocationInstantiator() {
        super((Class<?>) JsonLocation.class);
    }

    private static final int _int(Object obj) {
        if (obj == null) {
            return 0;
        }
        return ((Number) obj).intValue();
    }

    private static final long _long(Object obj) {
        if (obj == null) {
            return 0L;
        }
        return ((Number) obj).longValue();
    }

    private static CreatorProperty creatorProp(String str, JavaType javaType, int i3) {
        return CreatorProperty.construct(PropertyName.construct(str), javaType, null, null, null, null, i3, null, PropertyMetadata.STD_REQUIRED);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateFromObjectWith() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createFromObjectWith(DeserializationContext deserializationContext, Object[] objArr) {
        return new JsonLocation(ContentReference.rawReference(objArr[0]), _long(objArr[1]), _long(objArr[2]), _int(objArr[3]), _int(objArr[4]));
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig deserializationConfig) {
        JavaType constructType = deserializationConfig.constructType(Integer.TYPE);
        JavaType constructType2 = deserializationConfig.constructType(Long.TYPE);
        return new SettableBeanProperty[]{creatorProp(StubApp.getString2(10735), deserializationConfig.constructType(Object.class), 0), creatorProp(StubApp.getString2(10736), constructType2, 1), creatorProp(StubApp.getString2(10737), constructType2, 2), creatorProp(StubApp.getString2(10738), constructType, 3), creatorProp(StubApp.getString2(10739), constructType, 4)};
    }
}
