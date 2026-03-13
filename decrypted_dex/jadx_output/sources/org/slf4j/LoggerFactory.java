package org.slf4j;

import Tc.b;
import Tc.c;
import Tc.d;
import com.stub.StubApp;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.helpers.NOPLoggerFactory;
import org.slf4j.helpers.SubstituteLoggerFactory;
import org.slf4j.impl.StaticLoggerBinder;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class LoggerFactory {
    private static final String[] API_COMPATIBILITY_LIST;
    static boolean DETECT_LOGGER_NAME_MISMATCH = false;
    static final int FAILED_INITIALIZATION = 2;
    static volatile int INITIALIZATION_STATE = 0;
    static final int NOP_FALLBACK_INITIALIZATION = 4;
    static final int ONGOING_INITIALIZATION = 1;
    private static String STATIC_LOGGER_BINDER_PATH = null;
    static final int SUCCESSFUL_INITIALIZATION = 3;
    static final int UNINITIALIZED = 0;
    static final String CODES_PREFIX = StubApp.getString2(35247);
    static final String DETECT_LOGGER_NAME_MISMATCH_PROPERTY = StubApp.getString2(35243);
    static final String JAVA_VENDOR_PROPERTY = StubApp.getString2(35248);
    static final String LOGGER_NAME_MISMATCH_URL = StubApp.getString2(35249);
    static final String MULTIPLE_BINDINGS_URL = StubApp.getString2(35250);
    static final String NO_STATICLOGGERBINDER_URL = StubApp.getString2(35251);
    static final String NULL_LF_URL = StubApp.getString2(35252);
    static final String REPLAY_URL = StubApp.getString2(35253);
    static final String SUBSTITUTE_LOGGER_URL = StubApp.getString2(35254);
    static final String UNSUCCESSFUL_INIT_MSG = StubApp.getString2(35255);
    static final String UNSUCCESSFUL_INIT_URL = StubApp.getString2(35256);
    static final String VERSION_MISMATCH = StubApp.getString2(35257);
    static final SubstituteLoggerFactory SUBST_FACTORY = new SubstituteLoggerFactory();
    static final NOPLoggerFactory NOP_FALLBACK_FACTORY = new NOPLoggerFactory();

    static {
        String str;
        try {
            str = System.getProperty(StubApp.getString2(35243));
        } catch (SecurityException unused) {
            str = null;
        }
        DETECT_LOGGER_NAME_MISMATCH = str == null ? false : str.equalsIgnoreCase(StubApp.getString2(6547));
        API_COMPATIBILITY_LIST = new String[]{StubApp.getString2(35244), StubApp.getString2(35245)};
        STATIC_LOGGER_BINDER_PATH = StubApp.getString2(35246);
    }

    private LoggerFactory() {
    }

    private static final void bind() {
        Set<URL> set;
        try {
            try {
                if (isAndroid()) {
                    set = null;
                } else {
                    set = findPossibleStaticLoggerBinderPathSet();
                    reportMultipleBindingAmbiguity(set);
                }
                StaticLoggerBinder.getSingleton();
                INITIALIZATION_STATE = 3;
                reportActualBinding(set);
                postBindCleanUp();
            } catch (Exception e10) {
                failedBinding(e10);
                throw new IllegalStateException(StubApp.getString2("35258"), e10);
            } catch (NoClassDefFoundError e11) {
                if (!messageContainsOrgSlf4jImplStaticLoggerBinder(e11.getMessage())) {
                    failedBinding(e11);
                    throw e11;
                }
                INITIALIZATION_STATE = 4;
                d.r(StubApp.getString2("35263"));
                d.r(StubApp.getString2("35264"));
                d.r(StubApp.getString2("35265"));
                postBindCleanUp();
            } catch (NoSuchMethodError e12) {
                String message = e12.getMessage();
                if (message != null && message.contains(StubApp.getString2("35259"))) {
                    INITIALIZATION_STATE = 2;
                    d.r(StubApp.getString2("35260"));
                    d.r(StubApp.getString2("35261"));
                    d.r(StubApp.getString2("35262"));
                }
                throw e12;
            }
        } catch (Throwable th) {
            postBindCleanUp();
            throw th;
        }
    }

    private static void emitReplayOrSubstituionWarning(Sc.a aVar, int i3) {
        if (aVar.f6728a.g()) {
            emitReplayWarning(i3);
        } else {
            if (aVar.f6728a.f7418b instanceof Tc.a) {
                return;
            }
            emitSubstitutionWarning();
        }
    }

    private static void emitReplayWarning(int i3) {
        d.r(StubApp.getString2(35266) + i3 + StubApp.getString2(35267));
        d.r(StubApp.getString2(35268));
        d.r(StubApp.getString2(35269));
    }

    private static void emitSubstitutionWarning() {
        d.r(StubApp.getString2(35270));
        d.r(StubApp.getString2(35271));
        d.r(StubApp.getString2(35272));
        d.r(StubApp.getString2(35273));
        d.r(StubApp.getString2(35274));
    }

    public static void failedBinding(Throwable th) {
        INITIALIZATION_STATE = 2;
        System.err.println(StubApp.getString2(35275));
        System.err.println(StubApp.getString2(35276));
        th.printStackTrace();
    }

    public static Set<URL> findPossibleStaticLoggerBinderPathSet() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = LoggerFactory.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(STATIC_LOGGER_BINDER_PATH) : classLoader.getResources(STATIC_LOGGER_BINDER_PATH);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e10) {
            System.err.println(StubApp.getString2(35277));
            System.err.println(StubApp.getString2(35276));
            e10.printStackTrace();
        }
        return linkedHashSet;
    }

    private static void fixSubstituteLoggers() {
        SubstituteLoggerFactory substituteLoggerFactory = SUBST_FACTORY;
        synchronized (substituteLoggerFactory) {
            try {
                substituteLoggerFactory.f19584a = true;
                Iterator it = new ArrayList(substituteLoggerFactory.f19585b.values()).iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    bVar.f7418b = getLogger(bVar.f7417a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ILoggerFactory getILoggerFactory() {
        if (INITIALIZATION_STATE == 0) {
            synchronized (LoggerFactory.class) {
                try {
                    if (INITIALIZATION_STATE == 0) {
                        INITIALIZATION_STATE = 1;
                        performInitialization();
                    }
                } finally {
                }
            }
        }
        int i3 = INITIALIZATION_STATE;
        if (i3 == 1) {
            return SUBST_FACTORY;
        }
        if (i3 == 2) {
            throw new IllegalStateException(StubApp.getString2(35255));
        }
        if (i3 == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i3 == 4) {
            return NOP_FALLBACK_FACTORY;
        }
        throw new IllegalStateException(StubApp.getString2(35278));
    }

    public static a getLogger(String str) {
        return getILoggerFactory().a(str);
    }

    private static boolean isAmbiguousStaticLoggerBinderPathSet(Set<URL> set) {
        return set.size() > 1;
    }

    private static boolean isAndroid() {
        String str;
        try {
            str = System.getProperty(StubApp.getString2(35248));
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            return false;
        }
        return str.toLowerCase().contains(StubApp.getString2(3400));
    }

    private static boolean messageContainsOrgSlf4jImplStaticLoggerBinder(String str) {
        if (str == null) {
            return false;
        }
        return str.contains(StubApp.getString2(35283)) || str.contains(StubApp.getString2(35284));
    }

    private static boolean nonMatchingClasses(Class<?> cls, Class<?> cls2) {
        return !cls2.isAssignableFrom(cls);
    }

    private static final void performInitialization() {
        bind();
        if (INITIALIZATION_STATE == 3) {
            versionSanityCheck();
        }
    }

    private static void postBindCleanUp() {
        fixSubstituteLoggers();
        replayEvents();
        SubstituteLoggerFactory substituteLoggerFactory = SUBST_FACTORY;
        substituteLoggerFactory.f19585b.clear();
        substituteLoggerFactory.f19586c.clear();
    }

    private static void replayEvents() {
        LinkedBlockingQueue linkedBlockingQueue = SUBST_FACTORY.f19586c;
        int size = linkedBlockingQueue.size();
        ArrayList arrayList = new ArrayList(128);
        int i3 = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Sc.a aVar = (Sc.a) it.next();
                replaySingleEvent(aVar);
                int i10 = i3 + 1;
                if (i3 == 0) {
                    emitReplayOrSubstituionWarning(aVar, size);
                }
                i3 = i10;
            }
            arrayList.clear();
        }
    }

    private static void replaySingleEvent(Sc.a aVar) {
        if (aVar == null) {
            return;
        }
        b bVar = aVar.f6728a;
        String str = bVar.f7417a;
        if (bVar.f7418b == null) {
            throw new IllegalStateException(StubApp.getString2(35285));
        }
        if (bVar.f7418b instanceof Tc.a) {
            return;
        }
        if (!bVar.g()) {
            d.r(str);
        } else if (bVar.g()) {
            try {
                bVar.f7420d.invoke(bVar.f7418b, aVar);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    private static void reportActualBinding(Set<URL> set) {
        if (set == null || !isAmbiguousStaticLoggerBinderPathSet(set)) {
            return;
        }
        d.r(StubApp.getString2(35286) + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + StubApp.getString2(511));
    }

    private static void reportMultipleBindingAmbiguity(Set<URL> set) {
        if (isAmbiguousStaticLoggerBinderPathSet(set)) {
            d.r(StubApp.getString2(35287));
            Iterator<URL> it = set.iterator();
            while (it.hasNext()) {
                d.r(StubApp.getString2(35288) + it.next() + StubApp.getString2(511));
            }
            d.r(StubApp.getString2(35289));
        }
    }

    public static void reset() {
        INITIALIZATION_STATE = 0;
    }

    private static final void versionSanityCheck() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z2 = false;
            for (String str2 : API_COMPATIBILITY_LIST) {
                if (str.startsWith(str2)) {
                    z2 = true;
                }
            }
            if (z2) {
                return;
            }
            d.r(StubApp.getString2("35290") + str + StubApp.getString2("35291") + Arrays.asList(API_COMPATIBILITY_LIST).toString());
            d.r(StubApp.getString2("35292"));
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            System.err.println(StubApp.getString2(35293));
            System.err.println(StubApp.getString2(35276));
            th.printStackTrace();
        }
    }

    public static a getLogger(Class<?> cls) {
        int i3;
        a logger = getLogger(cls.getName());
        if (DETECT_LOGGER_NAME_MISMATCH) {
            c cVar = d.f7424a;
            Class cls2 = null;
            if (cVar == null) {
                if (d.f7425b) {
                    cVar = null;
                } else {
                    try {
                        cVar = new c();
                    } catch (SecurityException unused) {
                        cVar = null;
                    }
                    d.f7424a = cVar;
                    d.f7425b = true;
                }
            }
            if (cVar != null) {
                Class[] classContext = cVar.getClassContext();
                String name = d.class.getName();
                int i10 = 0;
                while (i10 < classContext.length && !name.equals(classContext[i10].getName())) {
                    i10++;
                }
                if (i10 < classContext.length && (i3 = i10 + 2) < classContext.length) {
                    cls2 = classContext[i3];
                } else {
                    throw new IllegalStateException(StubApp.getString2(35282));
                }
            }
            if (cls2 != null && nonMatchingClasses(cls, cls2)) {
                d.r(StubApp.getString2(35279) + logger.getName() + StubApp.getString2(35280) + cls2.getName() + StubApp.getString2(12626));
                d.r(StubApp.getString2(35281));
            }
        }
        return logger;
    }
}
