package com.fasterxml.jackson.core.util;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class InternCache extends ConcurrentHashMap<String, String> {
    public static final InternCache instance = new InternCache();
    private final Object lock;

    private InternCache() {
        super(180, 0.8f, 4);
        this.lock = new Object();
    }

    public String intern(String str) {
        String str2 = get(str);
        if (str2 != null) {
            return str2;
        }
        if (size() >= 180) {
            synchronized (this.lock) {
                try {
                    if (size() >= 180) {
                        clear();
                    }
                } finally {
                }
            }
        }
        String intern = str.intern();
        put(intern, intern);
        return intern;
    }
}
