package com.fasterxml.jackson.databind.exc;

import E1.a;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class InvalidNullException extends MismatchedInputException {
    protected final PropertyName _propertyName;

    public InvalidNullException(DeserializationContext deserializationContext, String str, PropertyName propertyName) {
        super(deserializationContext.getParser(), str);
        this._propertyName = propertyName;
    }

    public static InvalidNullException from(DeserializationContext deserializationContext, PropertyName propertyName, JavaType javaType) {
        InvalidNullException invalidNullException = new InvalidNullException(deserializationContext, a.j(StubApp.getString2(10773), ClassUtil.quotedOr(propertyName, StubApp.getString2(10772))), propertyName);
        if (javaType != null) {
            invalidNullException.setTargetType(javaType);
        }
        return invalidNullException;
    }
}
