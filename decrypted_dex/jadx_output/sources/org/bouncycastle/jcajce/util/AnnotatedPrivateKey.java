package org.bouncycastle.jcajce.util;

import com.stub.StubApp;
import java.security.PrivateKey;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class AnnotatedPrivateKey implements PrivateKey {
    public static final String LABEL = StubApp.getString2(744);
    private final Map<String, Object> annotations;
    private final PrivateKey key;

    public AnnotatedPrivateKey(PrivateKey privateKey, String str) {
        this.key = privateKey;
        this.annotations = Collections.singletonMap(StubApp.getString2(744), str);
    }

    public AnnotatedPrivateKey addAnnotation(String str, Object obj) {
        HashMap hashMap = new HashMap(this.annotations);
        hashMap.put(str, obj);
        return new AnnotatedPrivateKey(this.key, (Map<String, Object>) Collections.unmodifiableMap(hashMap));
    }

    public boolean equals(Object obj) {
        PrivateKey privateKey;
        if (obj instanceof AnnotatedPrivateKey) {
            privateKey = this.key;
            obj = ((AnnotatedPrivateKey) obj).key;
        } else {
            privateKey = this.key;
        }
        return privateKey.equals(obj);
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.key.getAlgorithm();
    }

    public Object getAnnotation(String str) {
        return this.annotations.get(str);
    }

    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return this.key.getEncoded();
    }

    @Override // java.security.Key
    public String getFormat() {
        return this.key.getFormat();
    }

    public PrivateKey getKey() {
        return this.key;
    }

    public int hashCode() {
        return this.key.hashCode();
    }

    public AnnotatedPrivateKey removeAnnotation(String str) {
        HashMap hashMap = new HashMap(this.annotations);
        hashMap.remove(str);
        return new AnnotatedPrivateKey(this.key, (Map<String, Object>) Collections.unmodifiableMap(hashMap));
    }

    public String toString() {
        Map<String, Object> map = this.annotations;
        String string2 = StubApp.getString2(744);
        return (map.containsKey(string2) ? this.annotations.get(string2) : this.key).toString();
    }

    public AnnotatedPrivateKey(PrivateKey privateKey, Map<String, Object> map) {
        this.key = privateKey;
        this.annotations = map;
    }
}
