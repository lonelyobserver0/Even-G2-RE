package l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import com.google.android.gms.internal.measurement.D1;
import com.stub.StubApp;
import h.AbstractC0997a;
import java.io.IOException;
import m.o;
import n.AbstractC1346k0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f15695e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f15696f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f15697a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f15698b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f15699c;

    /* renamed from: d, reason: collision with root package name */
    public Object f15700d;

    static {
        Class[] clsArr = {Context.class};
        f15695e = clsArr;
        f15696f = clsArr;
    }

    public h(Context context) {
        super(context);
        this.f15699c = context;
        Object[] objArr = {context};
        this.f15697a = objArr;
        this.f15698b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v61 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        ?? r42;
        Object string2;
        int i3;
        XmlResourceParser xmlResourceParser2;
        boolean z2;
        ColorStateList colorStateList;
        int resourceId;
        g gVar = new g(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r42 = 1;
            string2 = StubApp.getString2(19210);
            i3 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals(string2)) {
                    throw new RuntimeException(StubApp.getString2(19211).concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType == r42) {
                throw new RuntimeException(StubApp.getString2(19213));
            }
            Object string22 = StubApp.getString2(1569);
            Object string23 = StubApp.getString2(663);
            if (eventType != i3) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z11 && name2.equals(str)) {
                        xmlResourceParser2 = xmlResourceParser;
                        z2 = r42;
                        z11 = false;
                        str = null;
                        eventType = xmlResourceParser2.next();
                        r42 = z2;
                        i3 = 2;
                        z11 = z11;
                    } else if (name2.equals(string23)) {
                        gVar.f15671b = 0;
                        gVar.f15672c = 0;
                        gVar.f15673d = 0;
                        gVar.f15674e = 0;
                        gVar.f15675f = r42;
                        gVar.f15676g = r42;
                    } else if (name2.equals(string22)) {
                        if (!gVar.f15677h) {
                            o oVar = gVar.f15694z;
                            if (oVar == null || !oVar.f16977b.hasSubMenu()) {
                                gVar.f15677h = r42;
                                gVar.b(gVar.f15670a.add(gVar.f15671b, gVar.f15678i, gVar.j, gVar.f15679k));
                            } else {
                                gVar.f15677h = r42;
                                gVar.b(gVar.f15670a.addSubMenu(gVar.f15671b, gVar.f15678i, gVar.j, gVar.f15679k).getItem());
                            }
                        }
                    } else if (name2.equals(string2)) {
                        xmlResourceParser2 = xmlResourceParser;
                        z2 = r42;
                        z10 = z2;
                    }
                }
                xmlResourceParser2 = xmlResourceParser;
                z2 = r42;
            } else {
                if (!z11) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals(string23);
                    h hVar = gVar.f15669E;
                    if (equals) {
                        TypedArray obtainStyledAttributes = hVar.f15699c.obtainStyledAttributes(attributeSet, AbstractC0997a.f14408p);
                        gVar.f15671b = obtainStyledAttributes.getResourceId(r42, 0);
                        gVar.f15672c = obtainStyledAttributes.getInt(3, 0);
                        gVar.f15673d = obtainStyledAttributes.getInt(4, 0);
                        gVar.f15674e = obtainStyledAttributes.getInt(5, 0);
                        gVar.f15675f = obtainStyledAttributes.getBoolean(2, r42);
                        gVar.f15676g = obtainStyledAttributes.getBoolean(0, r42);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals(string22)) {
                            Context context = hVar.f15699c;
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0997a.f14409q);
                            gVar.f15678i = obtainStyledAttributes2.getResourceId(2, 0);
                            gVar.j = (obtainStyledAttributes2.getInt(5, gVar.f15672c) & (-65536)) | (obtainStyledAttributes2.getInt(6, gVar.f15673d) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                            gVar.f15679k = obtainStyledAttributes2.getText(7);
                            gVar.f15680l = obtainStyledAttributes2.getText(8);
                            gVar.f15681m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            gVar.f15682n = string == null ? (char) 0 : string.charAt(0);
                            gVar.f15683o = obtainStyledAttributes2.getInt(16, 4096);
                            String string3 = obtainStyledAttributes2.getString(10);
                            gVar.f15684p = string3 == null ? (char) 0 : string3.charAt(0);
                            gVar.f15685q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                gVar.f15686r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                gVar.f15686r = gVar.f15674e;
                            }
                            gVar.f15687s = obtainStyledAttributes2.getBoolean(3, false);
                            gVar.f15688t = obtainStyledAttributes2.getBoolean(4, gVar.f15675f);
                            gVar.f15689u = obtainStyledAttributes2.getBoolean(1, gVar.f15676g);
                            gVar.f15690v = obtainStyledAttributes2.getInt(21, -1);
                            gVar.f15693y = obtainStyledAttributes2.getString(12);
                            gVar.f15691w = obtainStyledAttributes2.getResourceId(13, 0);
                            gVar.f15692x = obtainStyledAttributes2.getString(15);
                            String string4 = obtainStyledAttributes2.getString(14);
                            boolean z12 = string4 != null;
                            if (z12 && gVar.f15691w == 0 && gVar.f15692x == null) {
                                gVar.f15694z = (o) gVar.a(string4, f15696f, hVar.f15698b);
                            } else {
                                if (z12) {
                                    Log.w(StubApp.getString2(19200), StubApp.getString2(19212));
                                }
                                gVar.f15694z = null;
                            }
                            gVar.f15665A = obtainStyledAttributes2.getText(17);
                            gVar.f15666B = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                gVar.f15668D = AbstractC1346k0.c(obtainStyledAttributes2.getInt(19, -1), gVar.f15668D);
                            } else {
                                gVar.f15668D = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = D1.j(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                gVar.f15667C = colorStateList;
                            } else {
                                gVar.f15667C = null;
                            }
                            obtainStyledAttributes2.recycle();
                            gVar.f15677h = false;
                            xmlResourceParser2 = xmlResourceParser;
                            z2 = true;
                        } else if (name3.equals(string2)) {
                            z2 = true;
                            gVar.f15677h = true;
                            SubMenu addSubMenu = gVar.f15670a.addSubMenu(gVar.f15671b, gVar.f15678i, gVar.j, gVar.f15679k);
                            gVar.b(addSubMenu.getItem());
                            xmlResourceParser2 = xmlResourceParser;
                            b(xmlResourceParser2, attributeSet, addSubMenu);
                        } else {
                            xmlResourceParser2 = xmlResourceParser;
                            z2 = true;
                            str = name3;
                            z11 = true;
                        }
                        eventType = xmlResourceParser2.next();
                        r42 = z2;
                        i3 = 2;
                        z11 = z11;
                    }
                }
                xmlResourceParser2 = xmlResourceParser;
                z2 = r42;
            }
            eventType = xmlResourceParser2.next();
            r42 = z2;
            i3 = 2;
            z11 = z11;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i3, Menu menu) {
        String string2 = StubApp.getString2(19214);
        if (!(menu instanceof m.l)) {
            super.inflate(i3, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z2 = false;
        try {
            try {
                xmlResourceParser = this.f15699c.getResources().getLayout(i3);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof m.l) {
                    m.l lVar = (m.l) menu;
                    if (!lVar.f16936p) {
                        lVar.w();
                        z2 = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z2) {
                    ((m.l) menu).v();
                }
                xmlResourceParser.close();
            } catch (IOException e10) {
                throw new InflateException(string2, e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException(string2, e11);
            }
        } catch (Throwable th) {
            if (z2) {
                ((m.l) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
