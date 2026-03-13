package org.bouncycastle.its.jcajce;

import com.stub.StubApp;
import i2.u;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jcajce.spec.AEADParameterSpec;
import org.bouncycastle.util.Integers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class ClassUtil {
    private static final Class gcmSpecClass = loadClass(ClassUtil.class, StubApp.getString2(29617));

    public static AlgorithmParameterSpec getGCMSpec(final byte[] bArr, final int i3) {
        if (gcmSpecClass != null) {
            try {
                return (AlgorithmParameterSpec) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.bouncycastle.its.jcajce.ClassUtil.1
                    @Override // java.security.PrivilegedAction
                    public Object run() {
                        try {
                            return ClassUtil.gcmSpecClass.getConstructor(Integer.TYPE, byte[].class).newInstance(Integers.valueOf(i3), bArr);
                        } catch (NoSuchMethodException e10) {
                            throw new IllegalStateException(StubApp.getString2(29616) + e10.getMessage());
                        } catch (Exception e11) {
                            throw new IllegalStateException(u.r(e11, new StringBuilder(StubApp.getString2(29615))));
                        }
                    }
                });
            } catch (IllegalStateException unused) {
            }
        }
        return new AEADParameterSpec(bArr, i3);
    }

    public static Class loadClass(Class cls, final String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (Class) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.bouncycastle.its.jcajce.ClassUtil.2
                @Override // java.security.PrivilegedAction
                public Object run() {
                    try {
                        return Class.forName(str);
                    } catch (Exception unused) {
                        return null;
                    }
                }
            });
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
