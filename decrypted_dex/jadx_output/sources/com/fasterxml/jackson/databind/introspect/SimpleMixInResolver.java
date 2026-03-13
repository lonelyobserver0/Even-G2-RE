package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class SimpleMixInResolver implements ClassIntrospector.MixInResolver, Serializable {
    protected Map<ClassKey, Class<?>> _localMixIns;
    protected final ClassIntrospector.MixInResolver _overrides;

    public SimpleMixInResolver(ClassIntrospector.MixInResolver mixInResolver) {
        this._overrides = mixInResolver;
    }

    @Override // com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver
    public Class<?> findMixInClassFor(Class<?> cls) {
        Map<ClassKey, Class<?>> map;
        ClassIntrospector.MixInResolver mixInResolver = this._overrides;
        Class<?> findMixInClassFor = mixInResolver == null ? null : mixInResolver.findMixInClassFor(cls);
        return (findMixInClassFor != null || (map = this._localMixIns) == null) ? findMixInClassFor : map.get(new ClassKey(cls));
    }

    public boolean hasMixIns() {
        if (this._localMixIns != null) {
            return true;
        }
        ClassIntrospector.MixInResolver mixInResolver = this._overrides;
        if (mixInResolver == null) {
            return false;
        }
        if (mixInResolver instanceof SimpleMixInResolver) {
            return ((SimpleMixInResolver) mixInResolver).hasMixIns();
        }
        return true;
    }
}
