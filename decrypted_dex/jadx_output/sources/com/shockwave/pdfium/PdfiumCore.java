package com.shockwave.pdfium;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.util.Size;
import com.stub.StubApp;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class PdfiumCore {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f12759b;

    /* renamed from: c, reason: collision with root package name */
    public static Field f12760c;

    /* renamed from: a, reason: collision with root package name */
    public int f12761a;

    static {
        try {
            System.loadLibrary(StubApp.getString2("16152"));
            System.loadLibrary(StubApp.getString2("16153"));
            System.loadLibrary(StubApp.getString2("16154"));
            System.loadLibrary(StubApp.getString2("16155"));
            System.loadLibrary(StubApp.getString2("16156"));
        } catch (UnsatisfiedLinkError e10) {
            Log.e(StubApp.getString2(6739), StubApp.getString2(16157) + e10);
        }
        f12759b = new Object();
        f12760c = null;
    }

    private native void nativeCloseDocument(long j);

    private native void nativeClosePage(long j);

    private native long nativeGetBookmarkDestIndex(long j, long j3);

    private native String nativeGetBookmarkTitle(long j);

    private native Integer nativeGetDestPageIndex(long j, long j3);

    private native String nativeGetDocumentMetaText(long j, String str);

    private native Long nativeGetFirstChildBookmark(long j, Long l9);

    private native RectF nativeGetLinkRect(long j);

    private native String nativeGetLinkURI(long j, long j3);

    private native int nativeGetPageCount(long j);

    private native long[] nativeGetPageLinks(long j);

    private native Size nativeGetPageSizeByIndex(long j, int i3, int i10);

    private native Long nativeGetSiblingBookmark(long j, long j3);

    private native long nativeLoadPage(long j, int i3);

    private native long nativeOpenDocument(int i3, String str);

    private native long nativeOpenMemDocument(byte[] bArr, String str);

    private native Point nativePageCoordsToDevice(long j, int i3, int i10, int i11, int i12, int i13, double d8, double d10);

    private native void nativeRenderPageBitmap(long j, Bitmap bitmap, int i3, int i10, int i11, int i12, int i13, boolean z2);

    public final void a(PdfDocument pdfDocument) {
        synchronized (f12759b) {
            try {
                Iterator it = pdfDocument.f12754c.keySet().iterator();
                while (it.hasNext()) {
                    nativeClosePage(((Long) pdfDocument.f12754c.get((Integer) it.next())).longValue());
                }
                pdfDocument.f12754c.clear();
                nativeCloseDocument(pdfDocument.f12752a);
                ParcelFileDescriptor parcelFileDescriptor = pdfDocument.f12753b;
                if (parcelFileDescriptor != null) {
                    try {
                        parcelFileDescriptor.close();
                    } catch (IOException unused) {
                    }
                    pdfDocument.f12753b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final PdfDocument.Meta b(PdfDocument pdfDocument) {
        PdfDocument.Meta meta;
        synchronized (f12759b) {
            meta = new PdfDocument.Meta();
            nativeGetDocumentMetaText(pdfDocument.f12752a, StubApp.getString2("16158"));
            nativeGetDocumentMetaText(pdfDocument.f12752a, StubApp.getString2("16159"));
            nativeGetDocumentMetaText(pdfDocument.f12752a, StubApp.getString2("16160"));
            nativeGetDocumentMetaText(pdfDocument.f12752a, StubApp.getString2("16161"));
            nativeGetDocumentMetaText(pdfDocument.f12752a, StubApp.getString2("16162"));
            nativeGetDocumentMetaText(pdfDocument.f12752a, StubApp.getString2("16163"));
            nativeGetDocumentMetaText(pdfDocument.f12752a, StubApp.getString2("16164"));
            nativeGetDocumentMetaText(pdfDocument.f12752a, StubApp.getString2("16165"));
        }
        return meta;
    }

    public final int c(PdfDocument pdfDocument) {
        int nativeGetPageCount;
        synchronized (f12759b) {
            nativeGetPageCount = nativeGetPageCount(pdfDocument.f12752a);
        }
        return nativeGetPageCount;
    }

    public final ArrayList d(PdfDocument pdfDocument, int i3) {
        synchronized (f12759b) {
            try {
                ArrayList arrayList = new ArrayList();
                Long l9 = (Long) pdfDocument.f12754c.get(Integer.valueOf(i3));
                if (l9 == null) {
                    return arrayList;
                }
                for (long j : nativeGetPageLinks(l9.longValue())) {
                    Integer nativeGetDestPageIndex = nativeGetDestPageIndex(pdfDocument.f12752a, j);
                    String nativeGetLinkURI = nativeGetLinkURI(pdfDocument.f12752a, j);
                    RectF nativeGetLinkRect = nativeGetLinkRect(j);
                    if (nativeGetLinkRect != null && (nativeGetDestPageIndex != null || nativeGetLinkURI != null)) {
                        PdfDocument.Link link = new PdfDocument.Link();
                        link.f12756a = nativeGetLinkRect;
                        link.f12757b = nativeGetDestPageIndex;
                        link.f12758c = nativeGetLinkURI;
                        arrayList.add(link);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Size e(PdfDocument pdfDocument, int i3) {
        Size nativeGetPageSizeByIndex;
        synchronized (f12759b) {
            nativeGetPageSizeByIndex = nativeGetPageSizeByIndex(pdfDocument.f12752a, i3, this.f12761a);
        }
        return nativeGetPageSizeByIndex;
    }

    public final ArrayList f(PdfDocument pdfDocument) {
        ArrayList arrayList;
        synchronized (f12759b) {
            try {
                arrayList = new ArrayList();
                Long nativeGetFirstChildBookmark = nativeGetFirstChildBookmark(pdfDocument.f12752a, null);
                if (nativeGetFirstChildBookmark != null) {
                    k(arrayList, pdfDocument, nativeGetFirstChildBookmark.longValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public final Point g(PdfDocument pdfDocument, int i3, int i10, int i11, int i12, int i13, double d8, double d10) {
        return nativePageCoordsToDevice(((Long) pdfDocument.f12754c.get(Integer.valueOf(i3))).longValue(), i10, i11, i12, i13, 0, d8, d10);
    }

    public final PdfDocument h(ParcelFileDescriptor parcelFileDescriptor, String str) {
        PdfDocument pdfDocument = new PdfDocument();
        pdfDocument.f12753b = parcelFileDescriptor;
        synchronized (f12759b) {
            int i3 = -1;
            try {
                try {
                    if (f12760c == null) {
                        Field declaredField = FileDescriptor.class.getDeclaredField(StubApp.getString2("16166"));
                        f12760c = declaredField;
                        declaredField.setAccessible(true);
                    }
                    i3 = f12760c.getInt(parcelFileDescriptor.getFileDescriptor());
                } catch (IllegalAccessException e10) {
                    e10.printStackTrace();
                }
            } catch (NoSuchFieldException e11) {
                e11.printStackTrace();
            }
            pdfDocument.f12752a = nativeOpenDocument(i3, str);
        }
        return pdfDocument;
    }

    public final PdfDocument i(String str, byte[] bArr) {
        PdfDocument pdfDocument = new PdfDocument();
        synchronized (f12759b) {
            pdfDocument.f12752a = nativeOpenMemDocument(bArr, str);
        }
        return pdfDocument;
    }

    public final void j(PdfDocument pdfDocument, int i3) {
        synchronized (f12759b) {
            pdfDocument.f12754c.put(Integer.valueOf(i3), Long.valueOf(nativeLoadPage(pdfDocument.f12752a, i3)));
        }
    }

    public final void k(ArrayList arrayList, PdfDocument pdfDocument, long j) {
        PdfDocument.Bookmark bookmark = new PdfDocument.Bookmark();
        nativeGetBookmarkTitle(j);
        nativeGetBookmarkDestIndex(pdfDocument.f12752a, j);
        arrayList.add(bookmark);
        Long nativeGetFirstChildBookmark = nativeGetFirstChildBookmark(pdfDocument.f12752a, Long.valueOf(j));
        if (nativeGetFirstChildBookmark != null) {
            k(bookmark.f12755a, pdfDocument, nativeGetFirstChildBookmark.longValue());
        }
        Long nativeGetSiblingBookmark = nativeGetSiblingBookmark(pdfDocument.f12752a, j);
        if (nativeGetSiblingBookmark != null) {
            k(arrayList, pdfDocument, nativeGetSiblingBookmark.longValue());
        }
    }

    public final void l(PdfDocument pdfDocument, Bitmap bitmap, int i3, int i10, int i11, int i12, int i13, boolean z2) {
        synchronized (f12759b) {
            try {
                nativeRenderPageBitmap(((Long) pdfDocument.f12754c.get(Integer.valueOf(i3))).longValue(), bitmap, this.f12761a, i10, i11, i12, i13, z2);
            } catch (NullPointerException e10) {
                Log.e(StubApp.getString2("6739"), StubApp.getString2("16168"));
                e10.printStackTrace();
            } catch (Exception e11) {
                Log.e(StubApp.getString2("6739"), StubApp.getString2("16167"));
                e11.printStackTrace();
            }
        }
    }
}
