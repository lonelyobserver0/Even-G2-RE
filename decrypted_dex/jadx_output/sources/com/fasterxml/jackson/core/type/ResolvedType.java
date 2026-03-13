package com.fasterxml.jackson.core.type;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class ResolvedType {
    public abstract ResolvedType getReferencedType();

    public boolean isReferenceType() {
        return getReferencedType() != null;
    }

    public abstract String toCanonical();
}
