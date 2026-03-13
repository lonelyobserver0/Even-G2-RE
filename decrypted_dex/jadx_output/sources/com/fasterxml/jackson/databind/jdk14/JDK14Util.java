package com.fasterxml.jackson.databind.jdk14;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.NativeImageUtil;
import com.stub.StubApp;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class JDK14Util {

    public static class CreatorLocator {
        protected final BeanDescription _beanDesc;
        protected final DeserializationConfig _config;
        protected final List<AnnotatedConstructor> _constructors;
        protected final AnnotationIntrospector _intr;
        protected final AnnotatedConstructor _primaryConstructor;
        protected final RawTypeName[] _recordFields;

        public CreatorLocator(DeserializationContext deserializationContext, BeanDescription beanDescription) {
            this._beanDesc = beanDescription;
            this._intr = deserializationContext.getAnnotationIntrospector();
            this._config = deserializationContext.getConfig();
            RawTypeName[] recordFields = RecordAccessor.instance().getRecordFields(beanDescription.getBeanClass());
            this._recordFields = recordFields;
            AnnotatedConstructor annotatedConstructor = null;
            if (recordFields == null) {
                this._constructors = beanDescription.getConstructors();
                this._primaryConstructor = null;
                return;
            }
            int length = recordFields.length;
            if (length != 0) {
                List<AnnotatedConstructor> constructors = beanDescription.getConstructors();
                this._constructors = constructors;
                Iterator<AnnotatedConstructor> it = constructors.iterator();
                loop0: while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AnnotatedConstructor next = it.next();
                    if (next.getParameterCount() == length) {
                        for (int i3 = 0; i3 < length; i3++) {
                            if (!next.getRawParameterType(i3).equals(this._recordFields[i3].rawType)) {
                                break;
                            }
                        }
                        annotatedConstructor = next;
                        break loop0;
                    }
                }
            } else {
                annotatedConstructor = beanDescription.findDefaultConstructor();
                this._constructors = Collections.singletonList(annotatedConstructor);
            }
            if (annotatedConstructor == null) {
                throw new IllegalArgumentException(StubApp.getString2(10845) + ClassUtil.getTypeDescription(this._beanDesc.getType()));
            }
            this._primaryConstructor = annotatedConstructor;
        }

        public AnnotatedConstructor locate(List<String> list) {
            for (AnnotatedConstructor annotatedConstructor : this._constructors) {
                JsonCreator.Mode findCreatorAnnotation = this._intr.findCreatorAnnotation(this._config, annotatedConstructor);
                if (findCreatorAnnotation != null && JsonCreator.Mode.DISABLED != findCreatorAnnotation && (JsonCreator.Mode.DELEGATING == findCreatorAnnotation || annotatedConstructor != this._primaryConstructor)) {
                    return null;
                }
            }
            RawTypeName[] rawTypeNameArr = this._recordFields;
            if (rawTypeNameArr == null) {
                return null;
            }
            for (RawTypeName rawTypeName : rawTypeNameArr) {
                list.add(rawTypeName.name);
            }
            return this._primaryConstructor;
        }
    }

    public static class RawTypeName {
        public final String name;
        public final Class<?> rawType;

        public RawTypeName(Class<?> cls, String str) {
            this.rawType = cls;
            this.name = str;
        }
    }

    public static class RecordAccessor {
        private static final RecordAccessor INSTANCE;
        private static final RuntimeException PROBLEM;
        private final Method RECORD_COMPONENT_GET_NAME;
        private final Method RECORD_COMPONENT_GET_TYPE;
        private final Method RECORD_GET_RECORD_COMPONENTS;

        static {
            RecordAccessor recordAccessor = null;
            try {
                e = null;
                recordAccessor = new RecordAccessor();
            } catch (RuntimeException e10) {
                e = e10;
            }
            INSTANCE = recordAccessor;
            PROBLEM = e;
        }

        private RecordAccessor() throws RuntimeException {
            try {
                this.RECORD_GET_RECORD_COMPONENTS = Class.class.getMethod(StubApp.getString2("10846"), new Class[0]);
                Class<?> cls = Class.forName(StubApp.getString2("10847"));
                this.RECORD_COMPONENT_GET_NAME = cls.getMethod(StubApp.getString2("10848"), new Class[0]);
                this.RECORD_COMPONENT_GET_TYPE = cls.getMethod(StubApp.getString2("9392"), new Class[0]);
            } catch (Exception e10) {
                throw new RuntimeException(AbstractC1482f.i(StubApp.getString2(10849), e10.getClass().getName(), StubApp.getString2(3046), e10.getMessage()), e10);
            }
        }

        public static RecordAccessor instance() {
            RuntimeException runtimeException = PROBLEM;
            if (runtimeException == null) {
                return INSTANCE;
            }
            throw runtimeException;
        }

        public String[] getRecordFieldNames(Class<?> cls) throws IllegalArgumentException {
            Object[] recordComponents = recordComponents(cls);
            if (recordComponents == null) {
                return null;
            }
            String[] strArr = new String[recordComponents.length];
            for (int i3 = 0; i3 < recordComponents.length; i3++) {
                try {
                    strArr[i3] = (String) this.RECORD_COMPONENT_GET_NAME.invoke(recordComponents[i3], new Object[0]);
                } catch (Exception e10) {
                    throw new IllegalArgumentException(String.format(StubApp.getString2(10850), Integer.valueOf(i3), Integer.valueOf(recordComponents.length), ClassUtil.nameOf(cls)), e10);
                }
            }
            return strArr;
        }

        public RawTypeName[] getRecordFields(Class<?> cls) throws IllegalArgumentException {
            Object[] recordComponents = recordComponents(cls);
            if (recordComponents == null) {
                return null;
            }
            RawTypeName[] rawTypeNameArr = new RawTypeName[recordComponents.length];
            for (int i3 = 0; i3 < recordComponents.length; i3++) {
                try {
                    try {
                        rawTypeNameArr[i3] = new RawTypeName((Class) this.RECORD_COMPONENT_GET_TYPE.invoke(recordComponents[i3], new Object[0]), (String) this.RECORD_COMPONENT_GET_NAME.invoke(recordComponents[i3], new Object[0]));
                    } catch (Exception e10) {
                        throw new IllegalArgumentException(String.format(StubApp.getString2(10851), Integer.valueOf(i3), Integer.valueOf(recordComponents.length), ClassUtil.nameOf(cls)), e10);
                    }
                } catch (Exception e11) {
                    throw new IllegalArgumentException(String.format(StubApp.getString2(10850), Integer.valueOf(i3), Integer.valueOf(recordComponents.length), ClassUtil.nameOf(cls)), e11);
                }
            }
            return rawTypeNameArr;
        }

        public Object[] recordComponents(Class<?> cls) throws IllegalArgumentException {
            try {
                return (Object[]) this.RECORD_GET_RECORD_COMPONENTS.invoke(cls, new Object[0]);
            } catch (Exception e10) {
                if (NativeImageUtil.isUnsupportedFeatureError(e10)) {
                    return null;
                }
                throw new IllegalArgumentException(StubApp.getString2(10852) + ClassUtil.nameOf(cls));
            }
        }
    }

    public static AnnotatedConstructor findRecordConstructor(DeserializationContext deserializationContext, BeanDescription beanDescription, List<String> list) {
        return new CreatorLocator(deserializationContext, beanDescription).locate(list);
    }

    public static String[] getRecordFieldNames(Class<?> cls) {
        return RecordAccessor.instance().getRecordFieldNames(cls);
    }
}
