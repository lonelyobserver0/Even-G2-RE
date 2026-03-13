package O;

import N.AbstractC0172s;
import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo f5069a;

    /* renamed from: b, reason: collision with root package name */
    public int f5070b = -1;

    public e(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f5069a = accessibilityNodeInfo;
    }

    public static String d(int i3) {
        if (i3 == 1) {
            return StubApp.getString2(3910);
        }
        if (i3 == 2) {
            return StubApp.getString2(3909);
        }
        switch (i3) {
            case 4:
                return StubApp.getString2(3908);
            case 8:
                return StubApp.getString2(3907);
            case 16:
                return StubApp.getString2(3906);
            case 32:
                return StubApp.getString2(3905);
            case 64:
                return StubApp.getString2(3904);
            case 128:
                return StubApp.getString2(3903);
            case 256:
                return StubApp.getString2(3902);
            case 512:
                return StubApp.getString2(3901);
            case 1024:
                return StubApp.getString2(3900);
            case 2048:
                return StubApp.getString2(3899);
            case 4096:
                return StubApp.getString2(3898);
            case 8192:
                return StubApp.getString2(3897);
            case 16384:
                return StubApp.getString2(3896);
            case 32768:
                return StubApp.getString2(3895);
            case PKIFailureInfo.notAuthorized /* 65536 */:
                return StubApp.getString2(3894);
            case PKIFailureInfo.unsupportedVersion /* 131072 */:
                return StubApp.getString2(3893);
            case PKIFailureInfo.transactionIdInUse /* 262144 */:
                return StubApp.getString2(3892);
            case PKIFailureInfo.signerNotTrusted /* 524288 */:
                return StubApp.getString2(3891);
            case PKIFailureInfo.badSenderNonce /* 2097152 */:
                return StubApp.getString2(3890);
            case R.id.accessibilityActionMoveWindow:
                return StubApp.getString2(3889);
            case R.id.accessibilityActionScrollInDirection:
                return StubApp.getString2(3888);
            default:
                switch (i3) {
                    case R.id.accessibilityActionShowOnScreen:
                        return StubApp.getString2(3887);
                    case R.id.accessibilityActionScrollToPosition:
                        return StubApp.getString2(3886);
                    case R.id.accessibilityActionScrollUp:
                        return StubApp.getString2(3885);
                    case R.id.accessibilityActionScrollLeft:
                        return StubApp.getString2(3884);
                    case R.id.accessibilityActionScrollDown:
                        return StubApp.getString2(3883);
                    case R.id.accessibilityActionScrollRight:
                        return StubApp.getString2(3882);
                    case R.id.accessibilityActionContextClick:
                        return StubApp.getString2(3881);
                    case R.id.accessibilityActionSetProgress:
                        return StubApp.getString2(3880);
                    default:
                        switch (i3) {
                            case R.id.accessibilityActionShowTooltip:
                                return StubApp.getString2(3879);
                            case R.id.accessibilityActionHideTooltip:
                                return StubApp.getString2(3878);
                            case R.id.accessibilityActionPageUp:
                                return StubApp.getString2(3877);
                            case R.id.accessibilityActionPageDown:
                                return StubApp.getString2(3876);
                            case R.id.accessibilityActionPageLeft:
                                return StubApp.getString2(3875);
                            case R.id.accessibilityActionPageRight:
                                return StubApp.getString2(3874);
                            case R.id.accessibilityActionPressAndHold:
                                return StubApp.getString2(3873);
                            default:
                                switch (i3) {
                                    case R.id.accessibilityActionImeEnter:
                                        return StubApp.getString2(3872);
                                    case R.id.accessibilityActionDragStart:
                                        return StubApp.getString2(3871);
                                    case R.id.accessibilityActionDragDrop:
                                        return StubApp.getString2(3870);
                                    case R.id.accessibilityActionDragCancel:
                                        return StubApp.getString2(3869);
                                    default:
                                        return StubApp.getString2(3868);
                                }
                        }
                }
        }
    }

    public final void a(int i3) {
        this.f5069a.addAction(i3);
    }

    public final void b(d dVar) {
        this.f5069a.addAction((AccessibilityNodeInfo.AccessibilityAction) dVar.f5065a);
    }

    public final ArrayList c(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f5069a;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public final boolean e(int i3) {
        Bundle extras = this.f5069a.getExtras();
        return extras != null && (extras.getInt(StubApp.getString2(3911), 0) & i3) == i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f5069a;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.f5069a;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        return this.f5070b == eVar.f5070b;
    }

    public final void f(Rect rect) {
        this.f5069a.getBoundsInParent(rect);
    }

    public final CharSequence g() {
        String string2 = StubApp.getString2(3912);
        boolean isEmpty = c(string2).isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.f5069a;
        if (isEmpty) {
            return accessibilityNodeInfo.getText();
        }
        ArrayList c10 = c(string2);
        ArrayList c11 = c(StubApp.getString2(3913));
        ArrayList c12 = c(StubApp.getString2(3914));
        ArrayList c13 = c(StubApp.getString2(3915));
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i3 = 0; i3 < c10.size(); i3++) {
            spannableString.setSpan(new a(((Integer) c13.get(i3)).intValue(), this, accessibilityNodeInfo.getExtras().getInt(StubApp.getString2(3916))), ((Integer) c10.get(i3)).intValue(), ((Integer) c11.get(i3)).intValue(), ((Integer) c12.get(i3)).intValue());
        }
        return spannableString;
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f5069a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        f(rect);
        sb2.append(StubApp.getString2(3917) + rect);
        AccessibilityNodeInfo accessibilityNodeInfo = this.f5069a;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb2.append(StubApp.getString2(3918) + rect);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            AbstractC0172s.c(accessibilityNodeInfo, rect);
        } else {
            Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable(StubApp.getString2(3919));
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        sb2.append(StubApp.getString2(3920) + rect);
        sb2.append(StubApp.getString2(3921));
        sb2.append(accessibilityNodeInfo.getPackageName());
        sb2.append(StubApp.getString2(3922));
        sb2.append(accessibilityNodeInfo.getClassName());
        sb2.append(StubApp.getString2(3923));
        sb2.append(g());
        sb2.append(StubApp.getString2(3924));
        sb2.append(accessibilityNodeInfo.getError());
        sb2.append(StubApp.getString2(3925));
        sb2.append(accessibilityNodeInfo.getMaxTextLength());
        sb2.append(StubApp.getString2(3926));
        sb2.append(i3 >= 30 ? G.a.c(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence(StubApp.getString2(3623)));
        sb2.append(StubApp.getString2(3927));
        sb2.append(accessibilityNodeInfo.getContentDescription());
        sb2.append(StubApp.getString2(3928));
        sb2.append(accessibilityNodeInfo.getTooltipText());
        sb2.append(StubApp.getString2(3929));
        sb2.append(accessibilityNodeInfo.getViewIdResourceName());
        sb2.append(StubApp.getString2(3930));
        sb2.append(i3 >= 33 ? J.b.c(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getString(StubApp.getString2(3931)));
        sb2.append(StubApp.getString2(3932));
        sb2.append(accessibilityNodeInfo.isCheckable());
        sb2.append(StubApp.getString2(3933));
        sb2.append(accessibilityNodeInfo.isChecked());
        sb2.append(StubApp.getString2(3934));
        sb2.append(accessibilityNodeInfo.getExtras().getBoolean(StubApp.getString2(3935)));
        sb2.append(StubApp.getString2(3936));
        sb2.append(accessibilityNodeInfo.isFocusable());
        sb2.append(StubApp.getString2(3937));
        sb2.append(accessibilityNodeInfo.isFocused());
        sb2.append(StubApp.getString2(3938));
        sb2.append(accessibilityNodeInfo.isSelected());
        sb2.append(StubApp.getString2(3939));
        sb2.append(accessibilityNodeInfo.isClickable());
        sb2.append(StubApp.getString2(3940));
        sb2.append(accessibilityNodeInfo.isLongClickable());
        sb2.append(StubApp.getString2(3941));
        sb2.append(accessibilityNodeInfo.isContextClickable());
        sb2.append(StubApp.getString2(3942));
        sb2.append(accessibilityNodeInfo.isEnabled());
        sb2.append(StubApp.getString2(3943));
        sb2.append(accessibilityNodeInfo.isPassword());
        sb2.append(StubApp.getString2(3944) + accessibilityNodeInfo.isScrollable());
        sb2.append(StubApp.getString2(3945));
        sb2.append(i3 >= 34 ? AbstractC0172s.d(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence(StubApp.getString2(3946)));
        sb2.append(StubApp.getString2(3947));
        sb2.append(e(67108864));
        sb2.append(StubApp.getString2(3948));
        sb2.append(accessibilityNodeInfo.isImportantForAccessibility());
        sb2.append(StubApp.getString2(3949));
        sb2.append(accessibilityNodeInfo.isVisibleToUser());
        sb2.append(StubApp.getString2(3950));
        sb2.append(i3 >= 33 ? J.b.d(accessibilityNodeInfo) : e(8388608));
        sb2.append(StubApp.getString2(3951));
        sb2.append(i3 >= 34 ? AbstractC0172s.g(accessibilityNodeInfo) : e(64));
        sb2.append(StubApp.getString2(3952));
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new d(actionList.get(i10), 0, null, null));
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            d dVar = (d) arrayList.get(i11);
            String d8 = d(((AccessibilityNodeInfo.AccessibilityAction) dVar.f5065a).getId());
            if (d8.equals(StubApp.getString2(3868))) {
                Object obj = dVar.f5065a;
                if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                    d8 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
                }
            }
            sb2.append(d8);
            if (i11 != arrayList.size() - 1) {
                sb2.append(StubApp.getString2(81));
            }
        }
        sb2.append(StubApp.getString2(511));
        return sb2.toString();
    }
}
