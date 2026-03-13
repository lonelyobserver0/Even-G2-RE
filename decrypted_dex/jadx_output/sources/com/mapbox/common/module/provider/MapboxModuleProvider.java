package com.mapbox.common.module.provider;

import C6.b;
import android.util.Log;
import com.stub.StubApp;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0004\u0012\u0015\u0018\u001b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001!B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/mapbox/common/module/provider/MapboxModuleProvider;", "", "<init>", "()V", "", "asGetterFun", "(Ljava/lang/String;)Ljava/lang/String;", "T", "LC6/b;", "type", "Lkotlin/Function1;", "", "Lcom/mapbox/common/module/provider/ModuleProviderArgument;", "paramsProvider", "createModule", "(LC6/b;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "TAG", "Ljava/lang/String;", "com/mapbox/common/module/provider/MapboxModuleProvider$noArgConstructorCreator$1", "noArgConstructorCreator", "Lcom/mapbox/common/module/provider/MapboxModuleProvider$noArgConstructorCreator$1;", "com/mapbox/common/module/provider/MapboxModuleProvider$kotlinObjectReferenceProvider$1", "kotlinObjectReferenceProvider", "Lcom/mapbox/common/module/provider/MapboxModuleProvider$kotlinObjectReferenceProvider$1;", "com/mapbox/common/module/provider/MapboxModuleProvider$singletonReferenceProvider$1", "singletonReferenceProvider", "Lcom/mapbox/common/module/provider/MapboxModuleProvider$singletonReferenceProvider$1;", "com/mapbox/common/module/provider/MapboxModuleProvider$defaultMapboxModuleCreator$1", "defaultMapboxModuleCreator", "Lcom/mapbox/common/module/provider/MapboxModuleProvider$defaultMapboxModuleCreator$1;", "Lcom/mapbox/common/module/provider/MapboxModuleProvider$ModuleInstanceProvider;", "instanceCreators", "[Lcom/mapbox/common/module/provider/MapboxModuleProvider$ModuleInstanceProvider;", "ModuleInstanceProvider", "common-android"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapboxModuleProvider {
    private static final MapboxModuleProvider$defaultMapboxModuleCreator$1 defaultMapboxModuleCreator;
    private static final ModuleInstanceProvider[] instanceCreators;
    private static final MapboxModuleProvider$kotlinObjectReferenceProvider$1 kotlinObjectReferenceProvider;
    private static final MapboxModuleProvider$noArgConstructorCreator$1 noArgConstructorCreator;
    private static final MapboxModuleProvider$singletonReferenceProvider$1 singletonReferenceProvider;
    private static final String TAG = StubApp.getString2(13827);
    public static final MapboxModuleProvider INSTANCE = new MapboxModuleProvider();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\bb\u0018\u00002\u00020\u0001J?\u0010\n\u001a\u0004\u0018\u00010\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/mapbox/common/module/provider/MapboxModuleProvider$ModuleInstanceProvider;", "", "Ljava/lang/Class;", "implClass", "LC6/b;", "type", "Lkotlin/Function1;", "", "Lcom/mapbox/common/module/provider/ModuleProviderArgument;", "paramsProvider", "getInstance", "(Ljava/lang/Class;LC6/b;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "common-android"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface ModuleInstanceProvider {
        Object getInstance(Class<?> implClass, b type, Function1<? super b, ModuleProviderArgument[]> paramsProvider);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.mapbox.common.module.provider.MapboxModuleProvider$noArgConstructorCreator$1] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.mapbox.common.module.provider.MapboxModuleProvider$kotlinObjectReferenceProvider$1] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.mapbox.common.module.provider.MapboxModuleProvider$singletonReferenceProvider$1] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.mapbox.common.module.provider.MapboxModuleProvider$defaultMapboxModuleCreator$1] */
    static {
        ?? r02 = new ModuleInstanceProvider() { // from class: com.mapbox.common.module.provider.MapboxModuleProvider$noArgConstructorCreator$1
            @Override // com.mapbox.common.module.provider.MapboxModuleProvider.ModuleInstanceProvider
            public Object getInstance(Class<?> implClass, b type, Function1<? super b, ModuleProviderArgument[]> paramsProvider) {
                Intrinsics.checkNotNullParameter(implClass, "implClass");
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(paramsProvider, "paramsProvider");
                Constructor<?> constructor = implClass.getConstructor(new Class[0]);
                Intrinsics.checkNotNullExpressionValue(constructor, "implClass.getConstructor()");
                return constructor.newInstance(new Object[0]);
            }
        };
        noArgConstructorCreator = r02;
        ?? r12 = new ModuleInstanceProvider() { // from class: com.mapbox.common.module.provider.MapboxModuleProvider$kotlinObjectReferenceProvider$1
            @Override // com.mapbox.common.module.provider.MapboxModuleProvider.ModuleInstanceProvider
            public Object getInstance(Class<?> implClass, b type, Function1<? super b, ModuleProviderArgument[]> paramsProvider) {
                Intrinsics.checkNotNullParameter(implClass, "implClass");
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(paramsProvider, "paramsProvider");
                return implClass.getField(StubApp.getString2(3545)).get(null);
            }
        };
        kotlinObjectReferenceProvider = r12;
        ?? r22 = new ModuleInstanceProvider() { // from class: com.mapbox.common.module.provider.MapboxModuleProvider$singletonReferenceProvider$1
            @Override // com.mapbox.common.module.provider.MapboxModuleProvider.ModuleInstanceProvider
            public Object getInstance(Class<?> implClass, b type, Function1<? super b, ModuleProviderArgument[]> paramsProvider) {
                Intrinsics.checkNotNullParameter(implClass, "implClass");
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(paramsProvider, "paramsProvider");
                return implClass.getMethod(StubApp.getString2(2877), new Class[0]).invoke(null, new Object[0]);
            }
        };
        singletonReferenceProvider = r22;
        ?? r32 = new ModuleInstanceProvider() { // from class: com.mapbox.common.module.provider.MapboxModuleProvider$defaultMapboxModuleCreator$1
            @Override // com.mapbox.common.module.provider.MapboxModuleProvider.ModuleInstanceProvider
            public Object getInstance(Class<?> implClass, b type, Function1<? super b, ModuleProviderArgument[]> paramsProvider) {
                Intrinsics.checkNotNullParameter(implClass, "implClass");
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(paramsProvider, "paramsProvider");
                ModuleProviderArgument[] invoke = paramsProvider.invoke(type);
                ArrayList arrayList = new ArrayList(invoke.length);
                for (ModuleProviderArgument moduleProviderArgument : invoke) {
                    arrayList.add(moduleProviderArgument.getExpectedArgumentClass());
                }
                Object[] array = arrayList.toArray(new Class[0]);
                Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                Class[] clsArr = (Class[]) array;
                Constructor<?> constructor = implClass.getConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                Intrinsics.checkNotNullExpressionValue(constructor, "implClass.getConstructor…ntClass }.toTypedArray())");
                ArrayList arrayList2 = new ArrayList(invoke.length);
                for (ModuleProviderArgument moduleProviderArgument2 : invoke) {
                    arrayList2.add(moduleProviderArgument2.getArgumentInstance());
                }
                Object[] array2 = arrayList2.toArray(new Object[0]);
                Intrinsics.checkNotNull(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                return constructor.newInstance(Arrays.copyOf(array2, array2.length));
            }
        };
        defaultMapboxModuleCreator = r32;
        instanceCreators = new ModuleInstanceProvider[]{r02, r12, r22, r32};
    }

    private MapboxModuleProvider() {
    }

    private final String asGetterFun(String str) {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(6443));
        sb2.append(Character.toUpperCase(str.charAt(0)));
        String substring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        sb2.append(substring);
        return sb2.toString();
    }

    public final <T> T createModule(b type, Function1<? super b, ModuleProviderArgument[]> paramsProvider) {
        String string2 = StubApp.getString2(13828);
        String string22 = StubApp.getString2(13829);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(paramsProvider, "paramsProvider");
        try {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(StubApp.getString2("13823"), Arrays.copyOf(new Object[]{type.f1130a}, 1));
            Intrinsics.checkNotNullExpressionValue(format, string2);
            Class<?> cls = Class.forName(string22.concat(format));
            Intrinsics.checkNotNullExpressionValue(cls, "forName(\n        \"$MODUL…dName\n        )}\"\n      )");
            T t3 = null;
            Object invoke = cls.getMethod(asGetterFun(StubApp.getString2("13830")), new Class[0]).invoke(null, new Object[0]);
            Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.Boolean");
            if (((Boolean) invoke).booleanValue()) {
                Field declaredField = cls.getDeclaredField(StubApp.getString2("13831"));
                Intrinsics.checkNotNullExpressionValue(declaredField, "configurationClass.getDe…N_PROVIDER_VARIABLE_NAME)");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                if (obj == null) {
                    throw new MapboxInvalidModuleException(type);
                }
                Class<?> type2 = declaredField.getType();
                Intrinsics.checkNotNullExpressionValue(type2, "providerField.type");
                String format2 = String.format(StubApp.getString2("13832"), Arrays.copyOf(new Object[]{type.f1130a}, 1));
                Intrinsics.checkNotNullExpressionValue(format2, string2);
                Method declaredMethod = type2.getDeclaredMethod(format2, new Class[0]);
                Intrinsics.checkNotNullExpressionValue(declaredMethod, "providerClass.getDeclare…            )\n          )");
                T t10 = (T) declaredMethod.invoke(obj, new Object[0]);
                Intrinsics.checkNotNullExpressionValue(t10, "providerMethod.invoke(provider)");
                return t10;
            }
            Object invoke2 = cls.getMethod(asGetterFun(StubApp.getString2("13833")), new Class[0]).invoke(null, new Object[0]);
            Intrinsics.checkNotNull(invoke2, "null cannot be cast to non-null type java.lang.Class<T of com.mapbox.common.module.provider.MapboxModuleProvider.createModule>");
            Class<?> cls2 = (Class) invoke2;
            ArrayList arrayList = new ArrayList();
            for (ModuleInstanceProvider moduleInstanceProvider : instanceCreators) {
                try {
                    t3 = (T) moduleInstanceProvider.getInstance(cls2, type, paramsProvider);
                } catch (Exception e10) {
                    if (e10 instanceof MapboxInvalidModuleException) {
                        throw e10;
                    }
                    arrayList.add(e10);
                }
                if (t3 != null) {
                    break;
                }
            }
            if (t3 == null) {
                Iterator<T> it = arrayList.iterator();
                while (it.hasNext()) {
                    Log.e(StubApp.getString2("13827"), StubApp.getString2("13834"), (Throwable) it.next());
                }
            }
            if (t3 != null) {
                return t3;
            }
            throw new MapboxInvalidModuleException(type);
        } catch (Exception e11) {
            if (e11 instanceof MapboxInvalidModuleException) {
                throw e11;
            }
            e11.printStackTrace();
            throw new MapboxInvalidModuleException(type);
        }
    }
}
