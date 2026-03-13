package com.fasterxml.jackson.annotation;

import com.stub.StubApp;
import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Locale;
import java.util.TimeZone;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public @interface JsonFormat {

    public enum Feature {
        ACCEPT_SINGLE_VALUE_AS_ARRAY,
        ACCEPT_CASE_INSENSITIVE_PROPERTIES,
        ACCEPT_CASE_INSENSITIVE_VALUES,
        WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS,
        WRITE_DATES_WITH_ZONE_ID,
        WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED,
        WRITE_SORTED_MAP_ENTRIES,
        ADJUST_DATES_TO_CONTEXT_TIME_ZONE
    }

    public static class Features {
        private static final Features EMPTY = new Features(0, 0);
        private final int _disabled;
        private final int _enabled;

        private Features(int i3, int i10) {
            this._enabled = i3;
            this._disabled = i10;
        }

        public static Features construct(JsonFormat jsonFormat) {
            return construct(jsonFormat.with(), jsonFormat.without());
        }

        public static Features empty() {
            return EMPTY;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            Features features = (Features) obj;
            return features._enabled == this._enabled && features._disabled == this._disabled;
        }

        public Boolean get(Feature feature) {
            int ordinal = 1 << feature.ordinal();
            if ((this._disabled & ordinal) != 0) {
                return Boolean.FALSE;
            }
            if ((ordinal & this._enabled) != 0) {
                return Boolean.TRUE;
            }
            return null;
        }

        public int hashCode() {
            return this._disabled + this._enabled;
        }

        public String toString() {
            if (this == EMPTY) {
                return StubApp.getString2(10188);
            }
            return String.format(StubApp.getString2(10189), Integer.valueOf(this._enabled), Integer.valueOf(this._disabled));
        }

        public Features withOverrides(Features features) {
            if (features != null) {
                int i3 = features._disabled;
                int i10 = features._enabled;
                if (i3 != 0 || i10 != 0) {
                    int i11 = this._enabled;
                    if (i11 == 0 && this._disabled == 0) {
                        return features;
                    }
                    int i12 = ((~i3) & i11) | i10;
                    int i13 = this._disabled;
                    int i14 = i3 | ((~i10) & i13);
                    if (i12 != i11 || i14 != i13) {
                        return new Features(i12, i14);
                    }
                }
            }
            return this;
        }

        public static Features construct(Feature[] featureArr, Feature[] featureArr2) {
            int i3 = 0;
            for (Feature feature : featureArr) {
                i3 |= 1 << feature.ordinal();
            }
            int i10 = 0;
            for (Feature feature2 : featureArr2) {
                i10 |= 1 << feature2.ordinal();
            }
            return new Features(i3, i10);
        }
    }

    public enum Shape {
        ANY,
        NATURAL,
        SCALAR,
        ARRAY,
        OBJECT,
        NUMBER,
        NUMBER_FLOAT,
        NUMBER_INT,
        STRING,
        BOOLEAN,
        BINARY;

        public boolean isNumeric() {
            return this == NUMBER || this == NUMBER_INT || this == NUMBER_FLOAT;
        }
    }

    public static class Value implements Serializable {
        private static final Value EMPTY = new Value();
        private final Features _features;
        private final Boolean _lenient;
        private final Locale _locale;
        private final String _pattern;
        private final Shape _shape;
        private transient TimeZone _timezone;
        private final String _timezoneStr;

        public Value() {
            this("", Shape.ANY, "", "", Features.empty(), null);
        }

        private static <T> boolean _equal(T t3, T t10) {
            if (t3 == null) {
                return t10 == null;
            }
            if (t10 == null) {
                return false;
            }
            return t3.equals(t10);
        }

        public static final Value empty() {
            return EMPTY;
        }

        public static Value forLeniency(boolean z2) {
            return new Value("", null, null, null, null, Features.empty(), Boolean.valueOf(z2));
        }

        public static final Value from(JsonFormat jsonFormat) {
            return jsonFormat == null ? EMPTY : new Value(jsonFormat);
        }

        public static Value merge(Value value, Value value2) {
            return value == null ? value2 : value.withOverrides(value2);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            Value value = (Value) obj;
            return this._shape == value._shape && this._features.equals(value._features) && _equal(this._lenient, value._lenient) && _equal(this._timezoneStr, value._timezoneStr) && _equal(this._pattern, value._pattern) && _equal(this._timezone, value._timezone) && _equal(this._locale, value._locale);
        }

        public Boolean getFeature(Feature feature) {
            return this._features.get(feature);
        }

        public Boolean getLenient() {
            return this._lenient;
        }

        public Locale getLocale() {
            return this._locale;
        }

        public String getPattern() {
            return this._pattern;
        }

        public Shape getShape() {
            return this._shape;
        }

        public TimeZone getTimeZone() {
            TimeZone timeZone = this._timezone;
            if (timeZone != null) {
                return timeZone;
            }
            String str = this._timezoneStr;
            if (str == null) {
                return null;
            }
            TimeZone timeZone2 = TimeZone.getTimeZone(str);
            this._timezone = timeZone2;
            return timeZone2;
        }

        public boolean hasLenient() {
            return this._lenient != null;
        }

        public boolean hasLocale() {
            return this._locale != null;
        }

        public boolean hasPattern() {
            String str = this._pattern;
            return str != null && str.length() > 0;
        }

        public boolean hasShape() {
            return this._shape != Shape.ANY;
        }

        public boolean hasTimeZone() {
            if (this._timezone != null) {
                return true;
            }
            String str = this._timezoneStr;
            return (str == null || str.isEmpty()) ? false : true;
        }

        public int hashCode() {
            String str = this._timezoneStr;
            int hashCode = str == null ? 1 : str.hashCode();
            String str2 = this._pattern;
            if (str2 != null) {
                hashCode ^= str2.hashCode();
            }
            int hashCode2 = this._shape.hashCode() + hashCode;
            Boolean bool = this._lenient;
            if (bool != null) {
                hashCode2 ^= bool.hashCode();
            }
            Locale locale = this._locale;
            if (locale != null) {
                hashCode2 += locale.hashCode();
            }
            return this._features.hashCode() ^ hashCode2;
        }

        public String toString() {
            return String.format("JsonFormat.Value(pattern=%s,shape=%s,lenient=%s,locale=%s,timezone=%s,features=%s)", this._pattern, this._shape, this._lenient, this._locale, this._timezoneStr, this._features);
        }

        public Value withLenient(Boolean bool) {
            return bool == this._lenient ? this : new Value(this._pattern, this._shape, this._locale, this._timezoneStr, this._timezone, this._features, bool);
        }

        public final Value withOverrides(Value value) {
            Value value2;
            TimeZone timeZone;
            if (value == null || value == (value2 = EMPTY) || value == this) {
                return this;
            }
            if (this == value2) {
                return value;
            }
            String str = value._pattern;
            if (str == null || str.isEmpty()) {
                str = this._pattern;
            }
            String str2 = str;
            Shape shape = value._shape;
            if (shape == Shape.ANY) {
                shape = this._shape;
            }
            Shape shape2 = shape;
            Locale locale = value._locale;
            if (locale == null) {
                locale = this._locale;
            }
            Locale locale2 = locale;
            Features features = this._features;
            Features withOverrides = features == null ? value._features : features.withOverrides(value._features);
            Boolean bool = value._lenient;
            if (bool == null) {
                bool = this._lenient;
            }
            Boolean bool2 = bool;
            String str3 = value._timezoneStr;
            if (str3 == null || str3.isEmpty()) {
                str3 = this._timezoneStr;
                timeZone = this._timezone;
            } else {
                timeZone = value._timezone;
            }
            return new Value(str2, shape2, locale2, str3, timeZone, withOverrides, bool2);
        }

        public Value(JsonFormat jsonFormat) {
            this(jsonFormat.pattern(), jsonFormat.shape(), jsonFormat.locale(), jsonFormat.timezone(), Features.construct(jsonFormat), jsonFormat.lenient().asBoolean());
        }

        public Value(String str, Shape shape, String str2, String str3, Features features, Boolean bool) {
            this(str, shape, (str2 == null || str2.length() == 0 || "##default".equals(str2)) ? null : new Locale(str2), (str3 == null || str3.length() == 0 || "##default".equals(str3)) ? null : str3, null, features, bool);
        }

        public Value(String str, Shape shape, Locale locale, String str2, TimeZone timeZone, Features features, Boolean bool) {
            this._pattern = str == null ? "" : str;
            this._shape = shape == null ? Shape.ANY : shape;
            this._locale = locale;
            this._timezone = timeZone;
            this._timezoneStr = str2;
            this._features = features == null ? Features.empty() : features;
            this._lenient = bool;
        }
    }

    OptBoolean lenient() default OptBoolean.DEFAULT;

    String locale() default "##default";

    String pattern() default "";

    Shape shape() default Shape.ANY;

    String timezone() default "##default";

    Feature[] with() default {};

    Feature[] without() default {};
}
