package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.introspect.Annotated;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AnnotatedAndMetadata<A extends Annotated, M> {
    public final A annotated;
    public final M metadata;

    public AnnotatedAndMetadata(A a3, M m4) {
        this.annotated = a3;
        this.metadata = m4;
    }

    public static <A extends Annotated, M> AnnotatedAndMetadata<A, M> of(A a3, M m4) {
        return new AnnotatedAndMetadata<>(a3, m4);
    }
}
