package y;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.stub.StubApp;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import org.bouncycastle.asn1.eac.EACTags;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: y.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1960f {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f23321b = {0, 4, 8};

    /* renamed from: c, reason: collision with root package name */
    public static final SparseIntArray f23322c;

    /* renamed from: a, reason: collision with root package name */
    public HashMap f23323a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23322c = sparseIntArray;
        sparseIntArray.append(55, 25);
        sparseIntArray.append(56, 26);
        sparseIntArray.append(58, 29);
        sparseIntArray.append(59, 30);
        sparseIntArray.append(64, 36);
        sparseIntArray.append(63, 35);
        sparseIntArray.append(37, 4);
        sparseIntArray.append(36, 3);
        sparseIntArray.append(34, 1);
        sparseIntArray.append(72, 6);
        sparseIntArray.append(73, 7);
        sparseIntArray.append(44, 17);
        sparseIntArray.append(45, 18);
        sparseIntArray.append(46, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(60, 32);
        sparseIntArray.append(61, 33);
        sparseIntArray.append(43, 10);
        sparseIntArray.append(42, 9);
        sparseIntArray.append(76, 13);
        sparseIntArray.append(79, 16);
        sparseIntArray.append(77, 14);
        sparseIntArray.append(74, 11);
        sparseIntArray.append(78, 15);
        sparseIntArray.append(75, 12);
        sparseIntArray.append(67, 40);
        sparseIntArray.append(53, 39);
        sparseIntArray.append(52, 41);
        sparseIntArray.append(66, 42);
        sparseIntArray.append(51, 20);
        sparseIntArray.append(65, 37);
        sparseIntArray.append(41, 5);
        sparseIntArray.append(54, 75);
        sparseIntArray.append(62, 75);
        sparseIntArray.append(57, 75);
        sparseIntArray.append(35, 75);
        sparseIntArray.append(33, 75);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(68, 54);
        sparseIntArray.append(47, 55);
        sparseIntArray.append(69, 56);
        sparseIntArray.append(48, 57);
        sparseIntArray.append(70, 58);
        sparseIntArray.append(49, 59);
        sparseIntArray.append(38, 61);
        sparseIntArray.append(40, 62);
        sparseIntArray.append(39, 63);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(71, 69);
        sparseIntArray.append(50, 70);
        sparseIntArray.append(29, 71);
        sparseIntArray.append(28, 72);
        sparseIntArray.append(30, 73);
        sparseIntArray.append(27, 74);
    }

    public static int[] a(C1955a c1955a, String str) {
        int i3;
        String[] split = str.split(StubApp.getString2(321));
        Context context = c1955a.getContext();
        int[] iArr = new int[split.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < split.length) {
            String trim = split[i10].trim();
            Object obj = null;
            try {
                i3 = AbstractC1961g.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i3 = 0;
            }
            if (i3 == 0) {
                i3 = context.getResources().getIdentifier(trim, StubApp.getString2(290), context.getPackageName());
            }
            if (i3 == 0 && c1955a.isInEditMode() && (c1955a.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c1955a.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.f9629n;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.f9629n.get(trim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    i3 = ((Integer) obj).intValue();
                }
            }
            iArr[i11] = i3;
            i10++;
            i11++;
        }
        return i11 != split.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    public static C1959e b(Context context, AttributeSet attributeSet) {
        C1959e c1959e = new C1959e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1962h.f23325b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            SparseIntArray sparseIntArray = f23322c;
            int i10 = sparseIntArray.get(index);
            switch (i10) {
                case 1:
                    c1959e.f23307p = d(obtainStyledAttributes, index, c1959e.f23307p);
                    break;
                case 2:
                    c1959e.f23259G = obtainStyledAttributes.getDimensionPixelSize(index, c1959e.f23259G);
                    break;
                case 3:
                    c1959e.f23305o = d(obtainStyledAttributes, index, c1959e.f23305o);
                    break;
                case 4:
                    c1959e.f23303n = d(obtainStyledAttributes, index, c1959e.f23303n);
                    break;
                case 5:
                    c1959e.f23317w = obtainStyledAttributes.getString(index);
                    break;
                case 6:
                    c1959e.f23253A = obtainStyledAttributes.getDimensionPixelOffset(index, c1959e.f23253A);
                    break;
                case 7:
                    c1959e.f23254B = obtainStyledAttributes.getDimensionPixelOffset(index, c1959e.f23254B);
                    break;
                case 8:
                    c1959e.f23260H = obtainStyledAttributes.getDimensionPixelSize(index, c1959e.f23260H);
                    break;
                case 9:
                    c1959e.f23314t = d(obtainStyledAttributes, index, c1959e.f23314t);
                    break;
                case 10:
                    c1959e.f23313s = d(obtainStyledAttributes, index, c1959e.f23313s);
                    break;
                case 11:
                    c1959e.f23266N = obtainStyledAttributes.getDimensionPixelSize(index, c1959e.f23266N);
                    break;
                case 12:
                    c1959e.f23267O = obtainStyledAttributes.getDimensionPixelSize(index, c1959e.f23267O);
                    break;
                case 13:
                    c1959e.f23263K = obtainStyledAttributes.getDimensionPixelSize(index, c1959e.f23263K);
                    break;
                case 14:
                    c1959e.f23265M = obtainStyledAttributes.getDimensionPixelSize(index, c1959e.f23265M);
                    break;
                case 15:
                    c1959e.f23268P = obtainStyledAttributes.getDimensionPixelSize(index, c1959e.f23268P);
                    break;
                case 16:
                    c1959e.f23264L = obtainStyledAttributes.getDimensionPixelSize(index, c1959e.f23264L);
                    break;
                case 17:
                    c1959e.f23287e = obtainStyledAttributes.getDimensionPixelOffset(index, c1959e.f23287e);
                    break;
                case 18:
                    c1959e.f23289f = obtainStyledAttributes.getDimensionPixelOffset(index, c1959e.f23289f);
                    break;
                case 19:
                    c1959e.f23291g = obtainStyledAttributes.getFloat(index, c1959e.f23291g);
                    break;
                case 20:
                    c1959e.f23315u = obtainStyledAttributes.getFloat(index, c1959e.f23315u);
                    break;
                case 21:
                    c1959e.f23283c = obtainStyledAttributes.getLayoutDimension(index, c1959e.f23283c);
                    break;
                case 22:
                    int i11 = obtainStyledAttributes.getInt(index, c1959e.f23262J);
                    c1959e.f23262J = i11;
                    c1959e.f23262J = f23321b[i11];
                    break;
                case 23:
                    c1959e.f23281b = obtainStyledAttributes.getLayoutDimension(index, c1959e.f23281b);
                    break;
                case 24:
                    c1959e.f23256D = obtainStyledAttributes.getDimensionPixelSize(index, c1959e.f23256D);
                    break;
                case 25:
                    c1959e.f23293h = d(obtainStyledAttributes, index, c1959e.f23293h);
                    break;
                case 26:
                    c1959e.f23294i = d(obtainStyledAttributes, index, c1959e.f23294i);
                    break;
                case 27:
                    c1959e.f23255C = obtainStyledAttributes.getInt(index, c1959e.f23255C);
                    break;
                case 28:
                    c1959e.f23257E = obtainStyledAttributes.getDimensionPixelSize(index, c1959e.f23257E);
                    break;
                case 29:
                    c1959e.j = d(obtainStyledAttributes, index, c1959e.j);
                    break;
                case 30:
                    c1959e.f23297k = d(obtainStyledAttributes, index, c1959e.f23297k);
                    break;
                case 31:
                    c1959e.f23261I = obtainStyledAttributes.getDimensionPixelSize(index, c1959e.f23261I);
                    break;
                case 32:
                    c1959e.f23309q = d(obtainStyledAttributes, index, c1959e.f23309q);
                    break;
                case 33:
                    c1959e.f23311r = d(obtainStyledAttributes, index, c1959e.f23311r);
                    break;
                case 34:
                    c1959e.f23258F = obtainStyledAttributes.getDimensionPixelSize(index, c1959e.f23258F);
                    break;
                case 35:
                    c1959e.f23301m = d(obtainStyledAttributes, index, c1959e.f23301m);
                    break;
                case EACTags.APPLICATION_EXPIRATION_DATE /* 36 */:
                    c1959e.f23299l = d(obtainStyledAttributes, index, c1959e.f23299l);
                    break;
                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                    c1959e.f23316v = obtainStyledAttributes.getFloat(index, c1959e.f23316v);
                    break;
                case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                    c1959e.f23285d = obtainStyledAttributes.getResourceId(index, c1959e.f23285d);
                    break;
                case EACTags.INTERCHANGE_CONTROL /* 39 */:
                    c1959e.f23270R = obtainStyledAttributes.getFloat(index, c1959e.f23270R);
                    break;
                case 40:
                    c1959e.f23269Q = obtainStyledAttributes.getFloat(index, c1959e.f23269Q);
                    break;
                case EACTags.INTERCHANGE_PROFILE /* 41 */:
                    c1959e.f23271S = obtainStyledAttributes.getInt(index, c1959e.f23271S);
                    break;
                case EACTags.CURRENCY_CODE /* 42 */:
                    c1959e.f23272T = obtainStyledAttributes.getInt(index, c1959e.f23272T);
                    break;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    c1959e.f23273U = obtainStyledAttributes.getFloat(index, c1959e.f23273U);
                    break;
                case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                    c1959e.f23274V = true;
                    c1959e.f23275W = obtainStyledAttributes.getDimension(index, c1959e.f23275W);
                    break;
                case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                    c1959e.f23277Y = obtainStyledAttributes.getFloat(index, c1959e.f23277Y);
                    break;
                case 46:
                    c1959e.f23278Z = obtainStyledAttributes.getFloat(index, c1959e.f23278Z);
                    break;
                case EACTags.PIN_USAGE_POLICY /* 47 */:
                    c1959e.f23280a0 = obtainStyledAttributes.getFloat(index, c1959e.f23280a0);
                    break;
                case 48:
                    c1959e.f23282b0 = obtainStyledAttributes.getFloat(index, c1959e.f23282b0);
                    break;
                case 49:
                    c1959e.f23284c0 = obtainStyledAttributes.getFloat(index, c1959e.f23284c0);
                    break;
                case 50:
                    c1959e.f23286d0 = obtainStyledAttributes.getFloat(index, c1959e.f23286d0);
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    c1959e.f23288e0 = obtainStyledAttributes.getDimension(index, c1959e.f23288e0);
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    c1959e.f23290f0 = obtainStyledAttributes.getDimension(index, c1959e.f23290f0);
                    break;
                case EACTags.SEX /* 53 */:
                    c1959e.f23292g0 = obtainStyledAttributes.getDimension(index, c1959e.f23292g0);
                    break;
                default:
                    switch (i10) {
                        case 60:
                            c1959e.f23276X = obtainStyledAttributes.getFloat(index, c1959e.f23276X);
                            break;
                        case 61:
                            c1959e.f23318x = d(obtainStyledAttributes, index, c1959e.f23318x);
                            break;
                        case 62:
                            c1959e.f23319y = obtainStyledAttributes.getDimensionPixelSize(index, c1959e.f23319y);
                            break;
                        case 63:
                            c1959e.f23320z = obtainStyledAttributes.getFloat(index, c1959e.f23320z);
                            break;
                        default:
                            String string2 = StubApp.getString2(364);
                            String string22 = StubApp.getString2(24557);
                            switch (i10) {
                                case EACTags.DISPLAY_IMAGE /* 69 */:
                                    c1959e.f23300l0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 70:
                                    c1959e.f23302m0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case EACTags.MESSAGE_REFERENCE /* 71 */:
                                    Log.e(string22, StubApp.getString2(24560));
                                    break;
                                case 72:
                                    c1959e.f23306o0 = obtainStyledAttributes.getInt(index, c1959e.f23306o0);
                                    break;
                                case 73:
                                    c1959e.f23312r0 = obtainStyledAttributes.getString(index);
                                    break;
                                case EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY /* 74 */:
                                    c1959e.f23304n0 = obtainStyledAttributes.getBoolean(index, c1959e.f23304n0);
                                    break;
                                case EACTags.DEPRECATED /* 75 */:
                                    Log.w(string22, StubApp.getString2(24559) + Integer.toHexString(index) + string2 + sparseIntArray.get(index));
                                    break;
                                default:
                                    Log.w(string22, StubApp.getString2(24558) + Integer.toHexString(index) + string2 + sparseIntArray.get(index));
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        return c1959e;
    }

    public static int d(TypedArray typedArray, int i3, int i10) {
        int resourceId = typedArray.getResourceId(i3, i10);
        return resourceId == -1 ? typedArray.getInt(i3, -1) : resourceId;
    }

    public final void c(Context context, int i3) {
        XmlResourceParser xml = context.getResources().getXml(i3);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C1959e b2 = b(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase(StubApp.getString2("24561"))) {
                        b2.f23279a = true;
                    }
                    this.f23323a.put(Integer.valueOf(b2.f23285d), b2);
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }
}
