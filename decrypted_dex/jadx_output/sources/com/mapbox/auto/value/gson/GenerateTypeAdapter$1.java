package com.mapbox.auto.value.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.stub.StubApp;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
class GenerateTypeAdapter$1 implements TypeAdapterFactory {

    /* renamed from: a, reason: collision with root package name */
    public final Class f12372a = Array.newInstance((Class<?>) Type.class, 0).getClass();

    /* renamed from: b, reason: collision with root package name */
    public final Map f12373b = Collections.synchronizedMap(new LinkedHashMap());

    public final Constructor a(Class cls) {
        Constructor<?> a3;
        Map map = this.f12373b;
        Constructor constructor = (Constructor) map.get(cls);
        if (constructor != null) {
            return constructor;
        }
        String name = cls.getName();
        if (name.startsWith(StubApp.getString2(8446)) || name.startsWith(StubApp.getString2(8445)) || name.startsWith(StubApp.getString2(13175))) {
            return null;
        }
        try {
            try {
                String replace = cls.getName().replace(StubApp.getString2("4963"), StubApp.getString2("4956"));
                Class<?> loadClass = cls.getClassLoader().loadClass(replace + StubApp.getString2("13176"));
                try {
                    a3 = loadClass.getDeclaredConstructor(Gson.class);
                    a3.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                    a3 = loadClass.getDeclaredConstructor(Gson.class, this.f12372a);
                    a3.setAccessible(true);
                }
            } catch (ClassNotFoundException unused2) {
                a3 = a(cls.getSuperclass());
                if (a3 != null) {
                    a3.setAccessible(true);
                }
            }
            map.put(cls, a3);
            return a3;
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(StubApp.getString2(13177).concat(name), e10);
        }
    }

    @Override // com.google.gson.TypeAdapterFactory
    public final TypeAdapter create(Gson gson, TypeToken typeToken) {
        String string2 = StubApp.getString2(13178);
        Class rawType = typeToken.getRawType();
        if (!rawType.isAnnotationPresent(a.class)) {
            return null;
        }
        Class superclass = rawType.getSuperclass();
        if (superclass.isAnnotationPresent(a.class)) {
            return gson.getAdapter(superclass);
        }
        Constructor a3 = a(rawType);
        if (a3 == null) {
            return null;
        }
        try {
            return a3.getParameterTypes().length == 1 ? (TypeAdapter) a3.newInstance(gson) : (TypeAdapter) a3.newInstance(gson, ((ParameterizedType) typeToken.getType()).getActualTypeArguments());
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(string2 + a3, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(string2 + a3, e11);
        } catch (InvocationTargetException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(StubApp.getString2(13179) + rawType, cause);
        }
    }
}
