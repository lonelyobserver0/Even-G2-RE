package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import java.io.Serializable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class NopAnnotationIntrospector extends AnnotationIntrospector implements Serializable {
    public static final NopAnnotationIntrospector instance = new NopAnnotationIntrospector() { // from class: com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector.1
    };
}
