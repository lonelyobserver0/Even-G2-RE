package kotlin.io;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¢\u0006\u0002\b\u0003\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0005H\u0000\u001a\u001c\u0010\u0010\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0000\"\u0018\u0010\u0004\u001a\u00020\u0002*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0018\u0010\b\u001a\u00020\u0005*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u0015\u0010\u000b\u001a\u00020\f*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\r¨\u0006\u0013"}, d2 = {"getRootLength", "", "", "getRootLength$FilesKt__FilePathComponentsKt", "rootName", "Ljava/io/File;", "getRootName", "(Ljava/io/File;)Ljava/lang/String;", "root", "getRoot", "(Ljava/io/File;)Ljava/io/File;", "isRooted", "", "(Ljava/io/File;)Z", "toComponents", "Lkotlin/io/FilePathComponents;", "subPath", "beginIndex", "endIndex", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/io/FilesKt")
@SourceDebugExtension({"SMAP\nFilePathComponents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,149:1\n1563#2:150\n1634#2,3:151\n*S KotlinDebug\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n*L\n134#1:150\n134#1:151,3\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class FilesKt__FilePathComponentsKt {
    public static final File getRoot(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new File(getRootName(file));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        r1 = kotlin.text.StringsKt__StringsKt.indexOf$default(r5, r0, 2, false, 4, (java.lang.Object) null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final int getRootLength$FilesKt__FilePathComponentsKt(java.lang.String r5) {
        /*
            char r0 = java.io.File.separatorChar
            r1 = 0
            r2 = 4
            int r3 = kotlin.text.StringsKt.w(r5, r0, r1, r2)
            r4 = 1
            if (r3 != 0) goto L2d
            int r1 = r5.length()
            if (r1 <= r4) goto L2c
            char r1 = r5.charAt(r4)
            if (r1 != r0) goto L2c
            r1 = 2
            int r1 = kotlin.text.StringsKt.w(r5, r0, r1, r2)
            if (r1 < 0) goto L2c
            int r1 = r1 + r4
            int r0 = kotlin.text.StringsKt.w(r5, r0, r1, r2)
            if (r0 < 0) goto L27
            int r0 = r0 + r4
            return r0
        L27:
            int r5 = r5.length()
            return r5
        L2c:
            return r4
        L2d:
            r0 = 58
            if (r3 <= 0) goto L3b
            int r2 = r3 + (-1)
            char r2 = r5.charAt(r2)
            if (r2 != r0) goto L3b
            int r3 = r3 + r4
            return r3
        L3b:
            r2 = -1
            if (r3 != r2) goto L49
            boolean r0 = kotlin.text.StringsKt.t(r5, r0)
            if (r0 == 0) goto L49
            int r5 = r5.length()
            return r5
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.FilesKt__FilePathComponentsKt.getRootLength$FilesKt__FilePathComponentsKt(java.lang.String):int");
    }

    public static final String getRootName(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        String path2 = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path2, "getPath(...)");
        String substring = path.substring(0, getRootLength$FilesKt__FilePathComponentsKt(path2));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static final boolean isRooted(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        return getRootLength$FilesKt__FilePathComponentsKt(path) > 0;
    }

    public static final File subPath(File file, int i3, int i10) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return toComponents(file).subPath(i3, i10);
    }

    public static final FilePathComponents toComponents(File file) {
        List split$default;
        List list;
        Intrinsics.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        Intrinsics.checkNotNull(path);
        int rootLength$FilesKt__FilePathComponentsKt = getRootLength$FilesKt__FilePathComponentsKt(path);
        String substring = path.substring(0, rootLength$FilesKt__FilePathComponentsKt);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        String substring2 = path.substring(rootLength$FilesKt__FilePathComponentsKt);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        if (substring2.length() == 0) {
            list = CollectionsKt.emptyList();
        } else {
            split$default = StringsKt__StringsKt.split$default((CharSequence) substring2, new char[]{File.separatorChar}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(CollectionsKt.f(split$default));
            Iterator it = split$default.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            list = arrayList;
        }
        return new FilePathComponents(new File(substring), list);
    }
}
