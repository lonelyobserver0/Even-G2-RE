package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumResolver;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.stub.StubApp;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

@JacksonStdImpl
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class StdKeyDeserializer extends KeyDeserializer implements Serializable {
    protected final FromStringDeserializer<?> _deser;
    protected final Class<?> _keyClass;
    protected final int _kind;

    public static final class DelegatingKD extends KeyDeserializer implements Serializable {
        protected final JsonDeserializer<?> _delegate;
        protected final Class<?> _keyClass;

        public DelegatingKD(Class<?> cls, JsonDeserializer<?> jsonDeserializer) {
            this._keyClass = cls;
            this._delegate = jsonDeserializer;
        }

        @Override // com.fasterxml.jackson.databind.KeyDeserializer
        public final Object deserializeKey(String str, DeserializationContext deserializationContext) throws IOException {
            if (str == null) {
                return null;
            }
            TokenBuffer bufferForInputBuffering = deserializationContext.bufferForInputBuffering();
            bufferForInputBuffering.writeString(str);
            try {
                JsonParser asParser = bufferForInputBuffering.asParser();
                asParser.nextToken();
                Object deserialize = this._delegate.deserialize(asParser, deserializationContext);
                return deserialize != null ? deserialize : deserializationContext.handleWeirdKey(this._keyClass, str, "not a valid representation", new Object[0]);
            } catch (Exception e10) {
                return deserializationContext.handleWeirdKey(this._keyClass, str, "not a valid representation: %s", e10.getMessage());
            }
        }
    }

    @JacksonStdImpl
    public static final class EnumKD extends StdKeyDeserializer {
        protected final EnumResolver _byNameResolver;
        protected EnumResolver _byToStringResolver;
        protected final Enum<?> _enumDefaultValue;
        protected final AnnotatedMethod _factory;

        public EnumKD(EnumResolver enumResolver, AnnotatedMethod annotatedMethod) {
            super(-1, enumResolver.getEnumClass());
            this._byNameResolver = enumResolver;
            this._factory = annotatedMethod;
            this._enumDefaultValue = enumResolver.getDefaultValue();
        }

        private EnumResolver _getToStringResolver(DeserializationContext deserializationContext) {
            EnumResolver constructUsingToString;
            EnumResolver enumResolver = this._byToStringResolver;
            if (enumResolver != null) {
                return enumResolver;
            }
            synchronized (this) {
                constructUsingToString = EnumResolver.constructUsingToString(deserializationContext.getConfig(), this._byNameResolver.getEnumClass());
                this._byToStringResolver = constructUsingToString;
            }
            return constructUsingToString;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer
        public Object _parse(String str, DeserializationContext deserializationContext) throws IOException {
            AnnotatedMethod annotatedMethod = this._factory;
            if (annotatedMethod != null) {
                try {
                    return annotatedMethod.call1(str);
                } catch (Exception e10) {
                    ClassUtil.unwrapAndThrowAsIAE(e10);
                }
            }
            EnumResolver _getToStringResolver = deserializationContext.isEnabled(DeserializationFeature.READ_ENUMS_USING_TO_STRING) ? _getToStringResolver(deserializationContext) : this._byNameResolver;
            Enum<?> findEnum = _getToStringResolver.findEnum(str);
            if (findEnum != null) {
                return findEnum;
            }
            if (this._enumDefaultValue != null && deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
                return this._enumDefaultValue;
            }
            if (deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return findEnum;
            }
            return deserializationContext.handleWeirdKey(this._keyClass, str, StubApp.getString2(10720), _getToStringResolver.getEnumIds());
        }
    }

    public static final class StringCtorKeyDeserializer extends StdKeyDeserializer {
        protected final Constructor<?> _ctor;

        public StringCtorKeyDeserializer(Constructor<?> constructor) {
            super(-1, constructor.getDeclaringClass());
            this._ctor = constructor;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer
        public Object _parse(String str, DeserializationContext deserializationContext) throws Exception {
            return this._ctor.newInstance(str);
        }
    }

    public static final class StringFactoryKeyDeserializer extends StdKeyDeserializer {
        final Method _factoryMethod;

        public StringFactoryKeyDeserializer(Method method) {
            super(-1, method.getDeclaringClass());
            this._factoryMethod = method;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer
        public Object _parse(String str, DeserializationContext deserializationContext) throws Exception {
            return this._factoryMethod.invoke(null, str);
        }
    }

    @JacksonStdImpl
    public static final class StringKD extends StdKeyDeserializer {
        private static final StringKD sString = new StringKD(String.class);
        private static final StringKD sObject = new StringKD(Object.class);

        private StringKD(Class<?> cls) {
            super(-1, cls);
        }

        public static StringKD forType(Class<?> cls) {
            return cls == String.class ? sString : cls == Object.class ? sObject : new StringKD(cls);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer, com.fasterxml.jackson.databind.KeyDeserializer
        public Object deserializeKey(String str, DeserializationContext deserializationContext) throws IOException {
            return str;
        }
    }

    public StdKeyDeserializer(int i3, Class<?> cls) {
        this(i3, cls, null);
    }

    public static StdKeyDeserializer forType(Class<?> cls) {
        int i3;
        if (cls == String.class || cls == Object.class || cls == CharSequence.class || cls == Serializable.class) {
            return StringKD.forType(cls);
        }
        if (cls == UUID.class) {
            i3 = 12;
        } else if (cls == Integer.class) {
            i3 = 5;
        } else if (cls == Long.class) {
            i3 = 6;
        } else if (cls == Date.class) {
            i3 = 10;
        } else if (cls == Calendar.class) {
            i3 = 11;
        } else if (cls == Boolean.class) {
            i3 = 1;
        } else if (cls == Byte.class) {
            i3 = 2;
        } else if (cls == Character.class) {
            i3 = 4;
        } else if (cls == Short.class) {
            i3 = 3;
        } else if (cls == Float.class) {
            i3 = 7;
        } else if (cls == Double.class) {
            i3 = 8;
        } else if (cls == URI.class) {
            i3 = 13;
        } else if (cls == URL.class) {
            i3 = 14;
        } else if (cls == Class.class) {
            i3 = 15;
        } else {
            if (cls == Locale.class) {
                return new StdKeyDeserializer(9, cls, FromStringDeserializer.findDeserializer(Locale.class));
            }
            if (cls == Currency.class) {
                return new StdKeyDeserializer(16, cls, FromStringDeserializer.findDeserializer(Currency.class));
            }
            if (cls != byte[].class) {
                return null;
            }
            i3 = 17;
        }
        return new StdKeyDeserializer(i3, cls);
    }

    public Object _parse(String str, DeserializationContext deserializationContext) throws Exception {
        switch (this._kind) {
            case 1:
                return "true".equals(str) ? Boolean.TRUE : "false".equals(str) ? Boolean.FALSE : deserializationContext.handleWeirdKey(this._keyClass, str, "value not 'true' or 'false'", new Object[0]);
            case 2:
                int _parseInt = _parseInt(str);
                return (_parseInt < -128 || _parseInt > 255) ? deserializationContext.handleWeirdKey(this._keyClass, str, "overflow, value cannot be represented as 8-bit value", new Object[0]) : Byte.valueOf((byte) _parseInt);
            case 3:
                int _parseInt2 = _parseInt(str);
                return (_parseInt2 < -32768 || _parseInt2 > 32767) ? deserializationContext.handleWeirdKey(this._keyClass, str, "overflow, value cannot be represented as 16-bit value", new Object[0]) : Short.valueOf((short) _parseInt2);
            case 4:
                return str.length() == 1 ? Character.valueOf(str.charAt(0)) : deserializationContext.handleWeirdKey(this._keyClass, str, "can only convert 1-character Strings", new Object[0]);
            case 5:
                return Integer.valueOf(_parseInt(str));
            case 6:
                return Long.valueOf(_parseLong(str));
            case 7:
                return Float.valueOf((float) _parseDouble(str));
            case 8:
                return Double.valueOf(_parseDouble(str));
            case 9:
                try {
                    return this._deser._deserialize(str, deserializationContext);
                } catch (IllegalArgumentException e10) {
                    return _weirdKey(deserializationContext, str, e10);
                }
            case 10:
                return deserializationContext.parseDate(str);
            case 11:
                return deserializationContext.constructCalendar(deserializationContext.parseDate(str));
            case 12:
                try {
                    return UUID.fromString(str);
                } catch (Exception e11) {
                    return _weirdKey(deserializationContext, str, e11);
                }
            case 13:
                try {
                    return URI.create(str);
                } catch (Exception e12) {
                    return _weirdKey(deserializationContext, str, e12);
                }
            case 14:
                try {
                    return new URL(str);
                } catch (MalformedURLException e13) {
                    return _weirdKey(deserializationContext, str, e13);
                }
            case 15:
                try {
                    return deserializationContext.findClass(str);
                } catch (Exception unused) {
                    return deserializationContext.handleWeirdKey(this._keyClass, str, "unable to parse key as Class", new Object[0]);
                }
            case 16:
                try {
                    return this._deser._deserialize(str, deserializationContext);
                } catch (IllegalArgumentException e14) {
                    return _weirdKey(deserializationContext, str, e14);
                }
            case 17:
                try {
                    return deserializationContext.getConfig().getBase64Variant().decode(str);
                } catch (IllegalArgumentException e15) {
                    return _weirdKey(deserializationContext, str, e15);
                }
            default:
                throw new IllegalStateException("Internal error: unknown key type " + this._keyClass);
        }
    }

    public double _parseDouble(String str) throws IllegalArgumentException {
        return NumberInput.parseDouble(str);
    }

    public int _parseInt(String str) throws IllegalArgumentException {
        return NumberInput.parseInt(str);
    }

    public long _parseLong(String str) throws IllegalArgumentException {
        return NumberInput.parseLong(str);
    }

    public Object _weirdKey(DeserializationContext deserializationContext, String str, Exception exc) throws IOException {
        return deserializationContext.handleWeirdKey(this._keyClass, str, "problem: %s", ClassUtil.exceptionMessage(exc));
    }

    @Override // com.fasterxml.jackson.databind.KeyDeserializer
    public Object deserializeKey(String str, DeserializationContext deserializationContext) throws IOException {
        if (str == null) {
            return null;
        }
        try {
            Object _parse = _parse(str, deserializationContext);
            if (_parse != null) {
                return _parse;
            }
            if (ClassUtil.isEnumType(this._keyClass) && deserializationContext.getConfig().isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            return deserializationContext.handleWeirdKey(this._keyClass, str, "not a valid representation", new Object[0]);
        } catch (Exception e10) {
            return deserializationContext.handleWeirdKey(this._keyClass, str, "not a valid representation, problem: (%s) %s", e10.getClass().getName(), ClassUtil.exceptionMessage(e10));
        }
    }

    public StdKeyDeserializer(int i3, Class<?> cls, FromStringDeserializer<?> fromStringDeserializer) {
        this._kind = i3;
        this._keyClass = cls;
        this._deser = fromStringDeserializer;
    }
}
