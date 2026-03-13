package bb;

import D5.r;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import com.stub.StubApp;
import java.io.IOException;
import org.json.JSONArray;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: bb.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0535a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10731a = d.class.getName().concat(StubApp.getString2(9328));

    /* renamed from: b, reason: collision with root package name */
    public static final String f10732b = d.class.getName().concat(StubApp.getString2(9329));

    /* renamed from: c, reason: collision with root package name */
    public static final String f10733c = d.class.getName().concat(StubApp.getString2(9330));

    /* renamed from: d, reason: collision with root package name */
    public static final String f10734d = d.class.getName().concat(StubApp.getString2(9331));

    public static r a(Context context) {
        int i3;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            String str = null;
            String string = bundle == null ? null : bundle.getString(f10731a, null);
            Bundle bundle2 = applicationInfo.metaData;
            if (bundle2 != null) {
                bundle2.getString(f10732b, null);
            }
            Bundle bundle3 = applicationInfo.metaData;
            if (bundle3 != null) {
                bundle3.getString(f10733c, null);
            }
            Bundle bundle4 = applicationInfo.metaData;
            String string2 = bundle4 == null ? null : bundle4.getString(f10734d, null);
            Bundle bundle5 = applicationInfo.metaData;
            if (bundle5 != null && (i3 = bundle5.getInt(StubApp.getString2(9332), 0)) > 0) {
                JSONArray jSONArray = new JSONArray();
                try {
                    XmlResourceParser xml = context.getResources().getXml(i3);
                    xml.next();
                    for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                        if (eventType == 2) {
                            if (xml.getName().equals(StubApp.getString2("9333"))) {
                                b(xml, jSONArray, false);
                            }
                        }
                    }
                    str = jSONArray.toString();
                } catch (IOException | XmlPullParserException unused) {
                }
            }
            String str2 = applicationInfo.nativeLibraryDir;
            Bundle bundle6 = applicationInfo.metaData;
            return new r(string, string2, str, str2, bundle6 != null ? bundle6.getBoolean(StubApp.getString2(9334), true) : true);
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void b(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z2) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, StubApp.getString2(9335), z2);
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                if (xmlResourceParser.getName().equals(StubApp.getString2(9336))) {
                    boolean attributeBooleanValue2 = xmlResourceParser.getAttributeBooleanValue(null, StubApp.getString2(9337), false);
                    xmlResourceParser.next();
                    if (xmlResourceParser.getEventType() != 4) {
                        throw new IllegalStateException(StubApp.getString2(9339));
                    }
                    String trim = xmlResourceParser.getText().trim();
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put(trim);
                    jSONArray2.put(attributeBooleanValue2);
                    jSONArray2.put(attributeBooleanValue);
                    jSONArray.put(jSONArray2);
                    xmlResourceParser.next();
                    if (xmlResourceParser.getEventType() != 3) {
                        throw new IllegalStateException(StubApp.getString2(9338));
                    }
                } else if (xmlResourceParser.getName().equals(StubApp.getString2(9333))) {
                    b(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else {
                    String name = xmlResourceParser.getName();
                    int eventType = xmlResourceParser.getEventType();
                    while (true) {
                        if (eventType != 3 || xmlResourceParser.getName() != name) {
                            eventType = xmlResourceParser.next();
                        }
                    }
                }
            } else if (next == 3) {
                return;
            }
        }
    }
}
