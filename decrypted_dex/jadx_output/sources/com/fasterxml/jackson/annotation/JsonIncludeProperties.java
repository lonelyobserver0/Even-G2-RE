package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public @interface JsonIncludeProperties {

    public static class Value implements Serializable {
        protected static final Value ALL = new Value(null);
        protected final Set<String> _included;

        public Value(Set<String> set) {
            this._included = set;
        }

        private static Set<String> _asSet(String[] strArr) {
            if (strArr == null || strArr.length == 0) {
                return Collections.EMPTY_SET;
            }
            HashSet hashSet = new HashSet(strArr.length);
            for (String str : strArr) {
                hashSet.add(str);
            }
            return hashSet;
        }

        private static boolean _equals(Set<String> set, Set<String> set2) {
            return set == null ? set2 == null : set.equals(set2);
        }

        public static Value all() {
            return ALL;
        }

        public static Value from(JsonIncludeProperties jsonIncludeProperties) {
            return jsonIncludeProperties == null ? ALL : new Value(_asSet(jsonIncludeProperties.value()));
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return obj != null && obj.getClass() == getClass() && _equals(this._included, ((Value) obj)._included);
        }

        public Set<String> getIncluded() {
            return this._included;
        }

        public int hashCode() {
            Set<String> set = this._included;
            if (set == null) {
                return 0;
            }
            return set.size();
        }

        public String toString() {
            return String.format("JsonIncludeProperties.Value(included=%s)", this._included);
        }
    }

    String[] value() default {};
}
