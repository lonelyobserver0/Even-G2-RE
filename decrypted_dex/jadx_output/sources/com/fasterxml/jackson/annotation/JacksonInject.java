package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public @interface JacksonInject {

    public static class Value implements Serializable {
        protected static final Value EMPTY = new Value(null, null);
        protected final Object _id;
        protected final Boolean _useInput;

        public Value(Object obj, Boolean bool) {
            this._id = obj;
            this._useInput = bool;
        }

        private static boolean _empty(Object obj, Boolean bool) {
            return obj == null && bool == null;
        }

        public static Value construct(Object obj, Boolean bool) {
            if ("".equals(obj)) {
                obj = null;
            }
            return _empty(obj, bool) ? EMPTY : new Value(obj, bool);
        }

        public static Value forId(Object obj) {
            return construct(obj, null);
        }

        public static Value from(JacksonInject jacksonInject) {
            return jacksonInject == null ? EMPTY : construct(jacksonInject.value(), jacksonInject.useInput().asBoolean());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == getClass()) {
                Value value = (Value) obj;
                if (OptBoolean.equals(this._useInput, value._useInput)) {
                    Object obj2 = this._id;
                    return obj2 == null ? value._id == null : obj2.equals(value._id);
                }
            }
            return false;
        }

        public Object getId() {
            return this._id;
        }

        public boolean hasId() {
            return this._id != null;
        }

        public int hashCode() {
            Object obj = this._id;
            int hashCode = obj != null ? 1 + obj.hashCode() : 1;
            Boolean bool = this._useInput;
            return bool != null ? bool.hashCode() + hashCode : hashCode;
        }

        public String toString() {
            return String.format("JacksonInject.Value(id=%s,useInput=%s)", this._id, this._useInput);
        }

        public boolean willUseInput(boolean z2) {
            Boolean bool = this._useInput;
            return bool == null ? z2 : bool.booleanValue();
        }

        public Value withId(Object obj) {
            return (obj != null ? !obj.equals(this._id) : this._id != null) ? new Value(obj, this._useInput) : this;
        }
    }

    OptBoolean useInput() default OptBoolean.DEFAULT;

    String value() default "";
}
