package com.shockwave.pdfium;

import android.graphics.RectF;
import android.os.ParcelFileDescriptor;
import android.util.ArrayMap;
import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class PdfDocument {

    /* renamed from: a, reason: collision with root package name */
    public long f12752a;

    /* renamed from: b, reason: collision with root package name */
    public ParcelFileDescriptor f12753b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayMap f12754c = new ArrayMap();

    public static class Bookmark {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f12755a = new ArrayList();
    }

    public static class Link {

        /* renamed from: a, reason: collision with root package name */
        public RectF f12756a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f12757b;

        /* renamed from: c, reason: collision with root package name */
        public String f12758c;
    }

    public static class Meta {
    }
}
