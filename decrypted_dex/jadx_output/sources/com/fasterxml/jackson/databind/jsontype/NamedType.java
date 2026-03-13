package com.fasterxml.jackson.databind.jsontype;

import Xa.h;
import java.io.Serializable;
import java.util.Objects;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class NamedType implements Serializable {
    protected final Class<?> _class;
    protected final int _hashCode;
    protected String _name;

    public NamedType(Class<?> cls) {
        this(cls, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != NamedType.class) {
            return false;
        }
        NamedType namedType = (NamedType) obj;
        return this._class == namedType._class && Objects.equals(this._name, namedType._name);
    }

    public String getName() {
        return this._name;
    }

    public Class<?> getType() {
        return this._class;
    }

    public boolean hasName() {
        return this._name != null;
    }

    public int hashCode() {
        return this._hashCode;
    }

    public void setName(String str) {
        if (str == null || str.isEmpty()) {
            str = null;
        }
        this._name = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[NamedType, class ");
        h.w(this._class, sb2, ", name: ");
        return AbstractC1482f.k(sb2, this._name == null ? "null" : AbstractC1482f.k(new StringBuilder("'"), this._name, "'"), "]");
    }

    public NamedType(Class<?> cls, String str) {
        this._class = cls;
        this._hashCode = cls.getName().hashCode() + (str == null ? 0 : str.hashCode());
        setName(str);
    }
}
