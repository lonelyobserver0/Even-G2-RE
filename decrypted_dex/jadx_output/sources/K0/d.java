package K0;

import android.util.Pair;
import com.stub.StubApp;
import java.util.LinkedList;
import o0.C1406C;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f3600a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3601b;

    /* renamed from: c, reason: collision with root package name */
    public final d f3602c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedList f3603d = new LinkedList();

    public d(d dVar, String str, String str2) {
        this.f3602c = dVar;
        this.f3600a = str;
        this.f3601b = str2;
    }

    public static int g(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return -1;
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException e10) {
            throw C1406C.b(null, e10);
        }
    }

    public static long h(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        try {
            return Long.parseLong(attributeValue);
        } catch (NumberFormatException e10) {
            throw C1406C.b(null, e10);
        }
    }

    public static int i(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            throw new e(str, 0);
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException e10) {
            throw C1406C.b(null, e10);
        }
    }

    public void a(Object obj) {
    }

    public abstract Object b();

    public final Object c(String str) {
        int i3 = 0;
        while (true) {
            LinkedList linkedList = this.f3603d;
            if (i3 >= linkedList.size()) {
                d dVar = this.f3602c;
                if (dVar == null) {
                    return null;
                }
                return dVar.c(str);
            }
            Pair pair = (Pair) linkedList.get(i3);
            if (((String) pair.first).equals(str)) {
                return pair.second;
            }
            i3++;
        }
    }

    public boolean d(String str) {
        return false;
    }

    public final Object e(XmlPullParser xmlPullParser) {
        boolean z2 = false;
        int i3 = 0;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            d dVar = null;
            if (eventType == 1) {
                return null;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (this.f3601b.equals(name)) {
                    j(xmlPullParser);
                    z2 = true;
                } else if (z2) {
                    if (i3 > 0) {
                        i3++;
                    } else if (d(name)) {
                        j(xmlPullParser);
                    } else {
                        String string2 = StubApp.getString2(3179);
                        boolean equals = string2.equals(name);
                        String str = this.f3600a;
                        if (equals) {
                            dVar = new g(this, str, string2);
                        } else {
                            String string22 = StubApp.getString2(3180);
                            if (string22.equals(name)) {
                                dVar = new f(this, str, string22);
                            } else if (StubApp.getString2(3181).equals(name)) {
                                dVar = new i(this, str);
                            }
                        }
                        if (dVar == null) {
                            i3 = 1;
                        } else {
                            a(dVar.e(xmlPullParser));
                        }
                    }
                }
            } else if (eventType != 3) {
                if (eventType == 4 && z2 && i3 == 0) {
                    k(xmlPullParser);
                }
            } else if (!z2) {
                continue;
            } else if (i3 > 0) {
                i3--;
            } else {
                String name2 = xmlPullParser.getName();
                f(xmlPullParser);
                if (!d(name2)) {
                    return b();
                }
            }
            xmlPullParser.next();
        }
    }

    public void f(XmlPullParser xmlPullParser) {
    }

    public abstract void j(XmlPullParser xmlPullParser);

    public void k(XmlPullParser xmlPullParser) {
    }

    public final void l(Object obj, String str) {
        this.f3603d.add(Pair.create(str, obj));
    }
}
