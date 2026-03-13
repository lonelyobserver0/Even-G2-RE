package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ViewMatcher implements Serializable {
    protected static final ViewMatcher EMPTY = new ViewMatcher();

    public static final class Multi extends ViewMatcher implements Serializable {
        private final Class<?>[] _views;

        public Multi(Class<?>[] clsArr) {
            this._views = clsArr;
        }

        @Override // com.fasterxml.jackson.databind.util.ViewMatcher
        public boolean isVisibleForView(Class<?> cls) {
            int length = this._views.length;
            for (int i3 = 0; i3 < length; i3++) {
                Class<?> cls2 = this._views[i3];
                if (cls == cls2 || cls2.isAssignableFrom(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final class Single extends ViewMatcher {
        private final Class<?> _view;

        public Single(Class<?> cls) {
            this._view = cls;
        }

        @Override // com.fasterxml.jackson.databind.util.ViewMatcher
        public boolean isVisibleForView(Class<?> cls) {
            Class<?> cls2 = this._view;
            return cls == cls2 || cls2.isAssignableFrom(cls);
        }
    }

    public static ViewMatcher construct(Class<?>[] clsArr) {
        int length;
        if (clsArr != null && (length = clsArr.length) != 0) {
            return length != 1 ? new Multi(clsArr) : new Single(clsArr[0]);
        }
        return EMPTY;
    }

    public boolean isVisibleForView(Class<?> cls) {
        return false;
    }
}
