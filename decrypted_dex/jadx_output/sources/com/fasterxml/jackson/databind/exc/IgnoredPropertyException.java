package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.stub.StubApp;
import java.util.Collection;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class IgnoredPropertyException extends PropertyBindingException {
    public IgnoredPropertyException(JsonParser jsonParser, String str, JsonLocation jsonLocation, Class<?> cls, String str2, Collection<Object> collection) {
        super(jsonParser, str, jsonLocation, cls, str2, collection);
    }

    public static IgnoredPropertyException from(JsonParser jsonParser, Object obj, String str, Collection<Object> collection) {
        Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
        IgnoredPropertyException ignoredPropertyException = new IgnoredPropertyException(jsonParser, AbstractC1482f.j(StubApp.getString2(10769), str, StubApp.getString2(10770), cls.getName(), StubApp.getString2(10771)), jsonParser.getCurrentLocation(), cls, str, collection);
        ignoredPropertyException.prependPath(obj, str);
        return ignoredPropertyException;
    }
}
