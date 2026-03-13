package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class UnresolvedId {
    private final Object _id;
    private final JsonLocation _location;
    private final Class<?> _type;

    public UnresolvedId(Object obj, Class<?> cls, JsonLocation jsonLocation) {
        this._id = obj;
        this._type = cls;
        this._location = jsonLocation;
    }

    public String toString() {
        return String.format(StubApp.getString2(10642), this._id, ClassUtil.nameOf(this._type), this._location);
    }
}
