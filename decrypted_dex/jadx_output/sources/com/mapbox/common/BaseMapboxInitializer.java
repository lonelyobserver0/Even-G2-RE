package com.mapbox.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 \u0012*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0012B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\f0\u000b¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0011\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/mapbox/common/BaseMapboxInitializer;", "", "T", "LR1/b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "create", "(Landroid/content/Context;)Ljava/lang/Boolean;", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "getInitializerClass", "()Ljava/lang/Class;", "initializerClass", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class BaseMapboxInitializer<T> implements R1.b {
    private static final long LOCK_WAIT_TIME_MS = 50;
    private static Context appContext;
    private static final String TAG = StubApp.getString2(13200);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final HashMap<Class<? extends R1.b>, InitializerData> initializersMap = new HashMap<>();
    private static final ReentrantLock globalLock = new ReentrantLock();

    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\u00020\n\"\b\b\u0001\u0010\u0004*\u00020\u00012\u0014\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0011\u001a\u00020\n2\u0012\u0010\u0007\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0016\u001a\u00020\n2\u0012\u0010\u0013\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u00052\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u00050\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001aH\u0082\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u0018H\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010\u000b\u001a\u00020\n\"\b\b\u0001\u0010\u0004*\u00020\u00012\u0014\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u0005H\u0007¢\u0006\u0004\b\u000b\u0010 RT\u0010#\u001a6\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\u0012\u0004\u0012\u00020\r0!j\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\u0012\u0004\u0012\u00020\r`\"8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010\u0003\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020(8\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lcom/mapbox/common/BaseMapboxInitializer$Companion;", "", "<init>", "()V", "T", "Ljava/lang/Class;", "LR1/b;", "initializerClass", "", "calledFromCreate", "", "init", "(Ljava/lang/Class;Z)V", "Lcom/mapbox/common/InitializerData;", "initializerData", "Lcom/mapbox/common/InitializerState;", "state", "updateState", "(Ljava/lang/Class;Lcom/mapbox/common/InitializerData;Lcom/mapbox/common/InitializerState;)V", "parentInitializerClass", "", "dependencySet", "getAllDependencies", "(Ljava/lang/Class;Ljava/util/Set;)V", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "function", "runCatchingEnhanced", "(Landroid/content/Context;Lcom/mapbox/common/InitializerData;Lkotlin/jvm/functions/Function0;)V", "getApplicationContextFromActivityThread", "()Landroid/content/Context;", "(Ljava/lang/Class;)V", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "initializersMap", "Ljava/util/HashMap;", "getInitializersMap", "()Ljava/util/HashMap;", "getInitializersMap$annotations", "", "LOCK_WAIT_TIME_MS", "J", "", "TAG", "Ljava/lang/String;", "appContext", "Landroid/content/Context;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void getAllDependencies(Class<? extends R1.b> parentInitializerClass, Set<Class<? extends R1.b>> dependencySet) {
            R1.b newInstance = parentInitializerClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            Intrinsics.checkNotNullExpressionValue(newInstance, "parentInitializerClass.g…nstructor().newInstance()");
            R1.b bVar = newInstance;
            if (bVar.dependencies().isEmpty()) {
                return;
            }
            List<Class<? extends R1.b>> dependencies = bVar.dependencies();
            Intrinsics.checkNotNullExpressionValue(dependencies, "instance.dependencies()");
            for (Class<? extends R1.b> childInitializerClass : dependencies) {
                Intrinsics.checkNotNullExpressionValue(childInitializerClass, "childInitializerClass");
                dependencySet.add(childInitializerClass);
                BaseMapboxInitializer.INSTANCE.getAllDependencies(childInitializerClass, dependencySet);
            }
        }

        @SuppressLint({"PrivateApi"})
        private final Context getApplicationContextFromActivityThread() {
            if (Intrinsics.areEqual(StubApp.getString2(13196), Build.FINGERPRINT)) {
                return null;
            }
            try {
                Class<?> cls = Class.forName(StubApp.getString2("13197"));
                Object invoke = cls.getMethod(StubApp.getString2("13199"), new Class[0]).invoke(cls.getMethod(StubApp.getString2("13198"), new Class[0]).invoke(null, new Object[0]), new Object[0]);
                Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type android.content.Context");
                return (Context) invoke;
            } catch (Throwable th) {
                try {
                    android.util.Log.w(StubApp.getString2("13200"), StubApp.getString2("13201"), th);
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            }
        }

        @JvmStatic
        public static /* synthetic */ void getInitializersMap$annotations() {
        }

        private final void runCatchingEnhanced(Context context, InitializerData initializerData, Function0<Unit> function) throws MapboxInitializerException {
            try {
                function.invoke();
            } catch (Throwable th) {
                throw new MapboxInitializerException(initializerData, context, th);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void updateState(Class<? extends R1.b> initializerClass, InitializerData initializerData, InitializerState state) {
            InitializerState initializerState;
            Unit unit;
            LinkedHashSet<Class<? extends R1.b>> linkedHashSet = new LinkedHashSet();
            getAllDependencies(initializerClass, linkedHashSet);
            for (Class<? extends R1.b> cls : linkedHashSet) {
                Companion companion = BaseMapboxInitializer.INSTANCE;
                InitializerData dependencyInitializerData = companion.getInitializersMap().get(cls);
                if (dependencyInitializerData != null) {
                    if (dependencyInitializerData.getState() != InitializerState.SUCCESS) {
                        HashMap<Class<? extends R1.b>, InitializerData> initializersMap = companion.getInitializersMap();
                        Intrinsics.checkNotNullExpressionValue(dependencyInitializerData, "dependencyInitializerData");
                        initializerState = state;
                        initializersMap.put(cls, InitializerData.copy$default(dependencyInitializerData, 0L, initializerState, 0, 5, null));
                    } else {
                        initializerState = state;
                    }
                    unit = Unit.INSTANCE;
                } else {
                    initializerState = state;
                    unit = null;
                }
                if (unit == null) {
                    companion.getInitializersMap().put(cls, new InitializerData(initializerData.getFirstInitElapsedTimeMs(), initializerState, initializerData.getCurrentInitAttempt()));
                }
                state = initializerState;
            }
            getInitializersMap().put(initializerClass, InitializerData.copy$default(initializerData, 0L, state, 0, 5, null));
        }

        public final HashMap<Class<? extends R1.b>, InitializerData> getInitializersMap() {
            return BaseMapboxInitializer.initializersMap;
        }

        @JvmStatic
        public final <T> void init(Class<? extends R1.b> initializerClass) {
            Intrinsics.checkNotNullParameter(initializerClass, "initializerClass");
            init(initializerClass, false);
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <T> void init(Class<? extends R1.b> initializerClass, boolean calledFromCreate) {
            boolean skipFurtherInitialization;
            boolean skipFurtherInitialization2;
            boolean skipFurtherInitialization3;
            String string2 = StubApp.getString2(13202);
            skipFurtherInitialization = BaseMapboxInitializerKt.skipFurtherInitialization(initializerClass);
            String string22 = StubApp.getString2(13200);
            if (skipFurtherInitialization) {
                if (calledFromCreate) {
                    try {
                        android.util.Log.i(string22, string2 + initializerClass.getSimpleName() + StubApp.getString2("13203"));
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                return;
            }
            Context context = BaseMapboxInitializer.appContext;
            if (context == null) {
                try {
                    android.util.Log.w(string22, StubApp.getString2("13204"));
                } catch (Throwable unused2) {
                }
                context = getApplicationContextFromActivityThread();
                if (context == null) {
                    return;
                }
            }
            while (!BaseMapboxInitializer.globalLock.tryLock(50L, TimeUnit.MILLISECONDS)) {
                skipFurtherInitialization3 = BaseMapboxInitializerKt.skipFurtherInitialization(initializerClass);
                if (skipFurtherInitialization3) {
                    return;
                }
            }
            try {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = (T) getInitializersMap().get(initializerClass);
                if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    InitializerData initializerData = (InitializerData) objectRef.element;
                    if ((initializerData != null ? initializerData.getState() : null) != InitializerState.IN_PROGRESS) {
                        android.util.Log.w(string22, StubApp.getString2("13205") + initializerClass.getSimpleName() + StubApp.getString2("13206"));
                    }
                }
                if (objectRef.element == null) {
                    objectRef.element = (T) new InitializerData(0L, null, 0, 7, null);
                    getInitializersMap().put(initializerClass, objectRef.element);
                } else {
                    skipFurtherInitialization2 = BaseMapboxInitializerKt.skipFurtherInitialization(initializerClass);
                    if (skipFurtherInitialization2) {
                        BaseMapboxInitializer.globalLock.unlock();
                        return;
                    }
                }
                T t3 = objectRef.element;
                objectRef.element = (T) InitializerData.copy$default((InitializerData) t3, 0L, null, ((InitializerData) t3).getCurrentInitAttempt() + 1, 3, null);
                getInitializersMap().put(initializerClass, objectRef.element);
                android.util.Log.i(string22, StubApp.getString2("13207") + initializerClass.getSimpleName() + StubApp.getString2("13208") + ((InitializerData) objectRef.element).getCurrentInitAttempt());
                T t10 = objectRef.element;
                InitializerData initializerData2 = (InitializerData) t10;
                try {
                    BaseMapboxInitializer.INSTANCE.updateState(initializerClass, (InitializerData) t10, InitializerState.IN_PROGRESS);
                    R1.a.c(context).d(initializerClass);
                    android.util.Log.i(string22, StubApp.getString2("13209") + initializerClass.getSimpleName() + StubApp.getString2("13210"));
                    getInitializersMap().put(initializerClass, InitializerData.copy$default((InitializerData) objectRef.element, 0L, InitializerState.SUCCESS, 0, 5, null));
                    BaseMapboxInitializer.globalLock.unlock();
                } catch (Throwable th) {
                    throw new MapboxInitializerException(initializerData2, context, th);
                }
            } catch (Throwable th2) {
                BaseMapboxInitializer.globalLock.unlock();
                throw th2;
            }
        }
    }

    public static final HashMap<Class<? extends R1.b>, InitializerData> getInitializersMap() {
        return INSTANCE.getInitializersMap();
    }

    @JvmStatic
    public static final <T> void init(Class<? extends R1.b> cls) {
        INSTANCE.init(cls);
    }

    @Override // R1.b
    public final List<Class<? extends R1.b>> dependencies() {
        return new ArrayList();
    }

    public abstract Class<? extends R1.b> getInitializerClass();

    @Override // R1.b
    public final Boolean create(Context context) {
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        android.util.Log.i(StubApp.getString2(13200), getClass().getSimpleName().concat(StubApp.getString2(13211)));
        appContext = StubApp.getOrigApplicationContext(context.getApplicationContext());
        try {
            INSTANCE.init(getInitializerClass(), true);
        } finally {
            if (unit == null) {
            }
            return Boolean.TRUE;
        }
        return Boolean.TRUE;
    }
}
