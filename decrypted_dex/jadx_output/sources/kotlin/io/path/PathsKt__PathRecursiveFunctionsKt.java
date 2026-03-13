package kotlin.io.path;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.FileSystemLoopException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;

@Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\f\u001aw\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012Q\b\u0002\u0010\u0003\u001aK\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0002\u0012\u0017\u0012\u00150\bj\u0002`\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0007\u001a´\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012Q\b\u0002\u0010\u0003\u001aK\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0002\u0012\u0017\u0012\u00150\bj\u0002`\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\f\u001a\u00020\r2C\b\u0002\u0010\u000f\u001a=\u0012\u0004\u0012\u00020\u0010\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0002\b\u0012H\u0007\u001a\u0011\u0010\u0013\u001a\u00020\u0014*\u00020\u0011H\u0003¢\u0006\u0002\b\u0015\u001a\u0011\u0010\u0013\u001a\u00020\u0014*\u00020\u000bH\u0003¢\u0006\u0002\b\u0015\u001a\f\u0010\u0016\u001a\u00020\u0017*\u00020\u0001H\u0007\u001a\u001b\u0010\u0018\u001a\f\u0012\b\u0012\u00060\bj\u0002`\n0\u0019*\u00020\u0001H\u0002¢\u0006\u0002\b\u001a\u001a$\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u001fH\u0082\b¢\u0006\u0002\b \u001a&\u0010!\u001a\u0004\u0018\u0001H\"\"\u0004\b\u0000\u0010\"2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\"0\u001fH\u0082\b¢\u0006\u0004\b#\u0010$\u001a1\u0010%\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\u00010&2\u0006\u0010\u0006\u001a\u00020\u00012\b\u0010'\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001c\u001a\u00020\u001dH\u0002¢\u0006\u0002\b(\u001a'\u0010)\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\u00010&2\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001dH\u0002¢\u0006\u0002\b*\u001a5\u0010+\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\u00010&2\u0006\u0010,\u001a\u00020\u00012\u0012\u0010-\u001a\n\u0012\u0006\b\u0001\u0012\u00020/0.\"\u00020/H\u0002¢\u0006\u0004\b0\u00101\u001a'\u00102\u001a\u00020\u00172\u0006\u00103\u001a\u00020\u00012\b\u0010'\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001c\u001a\u00020\u001dH\u0002¢\u0006\u0002\b4\u001a\u001d\u00105\u001a\u00020\u00172\u0006\u00106\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001dH\u0002¢\u0006\u0002\b7\u001a\f\u00108\u001a\u00020\u0017*\u00020\u0001H\u0000\u001a\u0019\u00109\u001a\u00020\u0017*\u00020\u00012\u0006\u0010'\u001a\u00020\u0001H\u0002¢\u0006\u0002\b:¨\u0006;"}, d2 = {"copyToRecursively", "Ljava/nio/file/Path;", "target", "onError", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "source", "Ljava/lang/Exception;", "exception", "Lkotlin/Exception;", "Lkotlin/io/path/OnErrorResult;", "followLinks", "", "overwrite", "copyAction", "Lkotlin/io/path/CopyActionContext;", "Lkotlin/io/path/CopyActionResult;", "Lkotlin/ExtensionFunctionType;", "toFileVisitResult", "Ljava/nio/file/FileVisitResult;", "toFileVisitResult$PathsKt__PathRecursiveFunctionsKt", "deleteRecursively", "", "deleteRecursivelyImpl", "", "deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt", "collectIfThrows", "collector", "Lkotlin/io/path/ExceptionsCollector;", "function", "Lkotlin/Function0;", "collectIfThrows$PathsKt__PathRecursiveFunctionsKt", "tryIgnoreNoSuchFileException", "R", "tryIgnoreNoSuchFileException$PathsKt__PathRecursiveFunctionsKt", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "handleEntry", "Ljava/nio/file/SecureDirectoryStream;", "parent", "handleEntry$PathsKt__PathRecursiveFunctionsKt", "enterDirectory", "enterDirectory$PathsKt__PathRecursiveFunctionsKt", "isDirectory", "entryName", "options", "", "Ljava/nio/file/LinkOption;", "isDirectory$PathsKt__PathRecursiveFunctionsKt", "(Ljava/nio/file/SecureDirectoryStream;Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z", "insecureHandleEntry", "entry", "insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt", "insecureEnterDirectory", "path", "insecureEnterDirectory$PathsKt__PathRecursiveFunctionsKt", "checkFileName", "checkNotSameAs", "checkNotSameAs$PathsKt__PathRecursiveFunctionsKt", "kotlin-stdlib-jdk7"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/io/path/PathsKt")
@SourceDebugExtension({"SMAP\nPathRecursiveFunctions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,532:1\n378#1,2:536\n386#1:538\n386#1:539\n380#1,4:540\n378#1,2:544\n386#1:546\n380#1,4:547\n386#1:551\n378#1,6:552\n378#1,2:558\n386#1:560\n380#1,4:561\n1#2:533\n1869#3,2:534\n*S KotlinDebug\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n*L\n394#1:536,2\n409#1:538\n412#1:539\n394#1:540,4\n420#1:544,2\n421#1:546\n420#1:547,4\n432#1:551\n440#1:552,6\n463#1:558,2\n464#1:560\n463#1:561,4\n314#1:534,2\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class PathsKt__PathRecursiveFunctionsKt extends PathsKt__PathReadWriteKt {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CopyActionResult.values().length];
            try {
                iArr[CopyActionResult.CONTINUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CopyActionResult.TERMINATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CopyActionResult.SKIP_SUBTREE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OnErrorResult.values().length];
            try {
                iArr2[OnErrorResult.TERMINATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OnErrorResult.SKIP_SUBTREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void checkFileName(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        String name = PathsKt__PathUtilsKt.getName(path);
        int hashCode = name.hashCode();
        if (hashCode != 46) {
            if (hashCode != 1518) {
                if (hashCode != 45679) {
                    if (hashCode != 45724) {
                        if (hashCode != 1472) {
                            if (hashCode != 1473 || !name.equals("./")) {
                                return;
                            }
                        } else if (!name.equals("..")) {
                            return;
                        }
                    } else if (!name.equals("..\\")) {
                        return;
                    }
                } else if (!name.equals("../")) {
                    return;
                }
            } else if (!name.equals(".\\")) {
                return;
            }
        } else if (!name.equals(".")) {
            return;
        }
        throw new IllegalFileNameException(path);
    }

    private static final void checkNotSameAs$PathsKt__PathRecursiveFunctionsKt(Path path, Path path2) {
        if (!Files.isSymbolicLink(path) && Files.isSameFile(path, path2)) {
            throw new FileSystemLoopException(path.toString());
        }
    }

    private static final void collectIfThrows$PathsKt__PathRecursiveFunctionsKt(ExceptionsCollector exceptionsCollector, Function0<Unit> function0) {
        try {
            function0.invoke();
        } catch (Exception e10) {
            exceptionsCollector.collect(e10);
        }
    }

    @SinceKotlin(version = "1.8")
    @ExperimentalPathApi
    public static final Path copyToRecursively(Path path, Path target, Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> onError, boolean z2, boolean z10) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(onError, "onError");
        return z10 ? copyToRecursively(path, target, onError, z2, new a(z2, 1)) : copyToRecursively$default(path, target, onError, z2, (Function3) null, 8, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileVisitResult copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(ArrayList<Path> arrayList, Function3<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult> function3, Path path, Path path2, Path path3, Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> function32, Path path4, BasicFileAttributes basicFileAttributes) {
        try {
            if (!arrayList.isEmpty()) {
                checkFileName(path4);
                Object last = CollectionsKt.last((List<? extends Object>) arrayList);
                Intrinsics.checkNotNullExpressionValue(last, "last(...)");
                checkNotSameAs$PathsKt__PathRecursiveFunctionsKt(path4, (Path) last);
            }
            return toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(function3.invoke(DefaultCopyActionContext.INSTANCE, path4, copyToRecursively$destination$PathsKt__PathRecursiveFunctionsKt(path, path2, path3, path4)));
        } catch (Exception e10) {
            return copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(function32, path, path2, path3, path4, e10);
        }
    }

    public static /* synthetic */ Path copyToRecursively$default(Path path, Path path2, Function3 function3, boolean z2, boolean z10, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            function3 = new Function3() { // from class: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$1
                @Override // kotlin.jvm.functions.Function3
                public final Void invoke(Path path3, Path path4, Exception exception) {
                    Intrinsics.checkNotNullParameter(path3, "<unused var>");
                    Intrinsics.checkNotNullParameter(path4, "<unused var>");
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    throw exception;
                }
            };
        }
        return copyToRecursively(path, path2, (Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult>) function3, z2, z10);
    }

    private static final Path copyToRecursively$destination$PathsKt__PathRecursiveFunctionsKt(Path path, Path path2, Path path3, Path path4) {
        Path resolve = path2.resolve(PathsKt__PathUtilsKt.relativeTo(path4, path).toString());
        if (!resolve.normalize().startsWith(path3)) {
            throw new IllegalFileNameException(path4, resolve, "Copying files to outside the specified target directory is prohibited. The directory being recursively copied might contain an entry with an illegal name.");
        }
        Intrinsics.checkNotNull(resolve);
        return resolve;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileVisitResult copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> function3, Path path, Path path2, Path path3, Path path4, Exception exc) {
        return toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(function3.invoke(path4, copyToRecursively$destination$PathsKt__PathRecursiveFunctionsKt(path, path2, path3, path4), exc));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CopyActionResult copyToRecursively$lambda$0$PathsKt__PathRecursiveFunctionsKt(boolean z2, CopyActionContext copyToRecursively, Path src, Path dst) {
        Intrinsics.checkNotNullParameter(copyToRecursively, "$this$copyToRecursively");
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(dst, "dst");
        LinkOption[] linkOptions = LinkFollowing.INSTANCE.toLinkOptions(z2);
        boolean isDirectory = Files.isDirectory(dst, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1));
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptions, linkOptions.length);
        if (!Files.isDirectory(src, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length)) || !isDirectory) {
            if (isDirectory) {
                deleteRecursively(dst);
            }
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.addSpread(linkOptions);
            spreadBuilder.add(StandardCopyOption.REPLACE_EXISTING);
            CopyOption[] copyOptionArr = (CopyOption[]) spreadBuilder.toArray(new CopyOption[spreadBuilder.size()]);
            Intrinsics.checkNotNullExpressionValue(Files.copy(src, dst, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length)), "copy(...)");
        }
        return CopyActionResult.CONTINUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CopyActionResult copyToRecursively$lambda$1$PathsKt__PathRecursiveFunctionsKt(boolean z2, CopyActionContext copyActionContext, Path src, Path dst) {
        Intrinsics.checkNotNullParameter(copyActionContext, "<this>");
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(dst, "dst");
        return copyActionContext.copyToIgnoringExistingDirectory(src, dst, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileVisitResult copyToRecursively$lambda$3$0$PathsKt__PathRecursiveFunctionsKt(ArrayList arrayList, Function3 function3, Path path, Path path2, Path path3, Function3 function32, Path directory, BasicFileAttributes attributes) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        FileVisitResult copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt = copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(arrayList, function3, path, path2, path3, function32, directory, attributes);
        if (copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt == FileVisitResult.CONTINUE) {
            arrayList.add(directory);
        }
        return copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileVisitResult copyToRecursively$lambda$3$1$PathsKt__PathRecursiveFunctionsKt(ArrayList arrayList, Function3 function3, Path path, Path path2, Path path3, Path directory, IOException iOException) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        CollectionsKt.removeLast(arrayList);
        return iOException == null ? FileVisitResult.CONTINUE : copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(function3, path, path2, path3, directory, iOException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copyToRecursively$lambda$3$PathsKt__PathRecursiveFunctionsKt(final ArrayList arrayList, final Function3 function3, final Path path, final Path path2, final Path path3, final Function3 function32, FileVisitorBuilder visitFileTree) {
        Intrinsics.checkNotNullParameter(visitFileTree, "$this$visitFileTree");
        visitFileTree.onPreVisitDirectory(new Function2() { // from class: kotlin.io.path.c
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                FileVisitResult copyToRecursively$lambda$3$0$PathsKt__PathRecursiveFunctionsKt;
                Path path4 = path3;
                Function3 function33 = function32;
                copyToRecursively$lambda$3$0$PathsKt__PathRecursiveFunctionsKt = PathsKt__PathRecursiveFunctionsKt.copyToRecursively$lambda$3$0$PathsKt__PathRecursiveFunctionsKt(arrayList, function3, path, path2, path4, function33, (Path) obj, (BasicFileAttributes) obj2);
                return copyToRecursively$lambda$3$0$PathsKt__PathRecursiveFunctionsKt;
            }
        });
        visitFileTree.onVisitFile(new PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2(arrayList, function3, path, path2, path3, function32));
        visitFileTree.onVisitFileFailed(new PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$3(function32, path, path2, path3));
        visitFileTree.onPostVisitDirectory(new Function2() { // from class: kotlin.io.path.d
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                FileVisitResult copyToRecursively$lambda$3$1$PathsKt__PathRecursiveFunctionsKt;
                Path path4 = path2;
                Path path5 = path3;
                copyToRecursively$lambda$3$1$PathsKt__PathRecursiveFunctionsKt = PathsKt__PathRecursiveFunctionsKt.copyToRecursively$lambda$3$1$PathsKt__PathRecursiveFunctionsKt(arrayList, function32, path, path4, path5, (Path) obj, (IOException) obj2);
                return copyToRecursively$lambda$3$1$PathsKt__PathRecursiveFunctionsKt;
            }
        });
        return Unit.INSTANCE;
    }

    @SinceKotlin(version = "1.8")
    @ExperimentalPathApi
    public static final void deleteRecursively(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        List<Exception> deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt = deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt(path);
        if (deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt.isEmpty()) {
            return;
        }
        FileSystemException fileSystemException = new FileSystemException("Failed to delete one or more files. See suppressed exceptions for details.");
        Iterator<T> it = deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt.iterator();
        while (it.hasNext()) {
            ExceptionsKt.addSuppressed(fileSystemException, (Exception) it.next());
        }
        throw fileSystemException;
    }

    private static final List<Exception> deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt(Path path) {
        DirectoryStream<Path> directoryStream;
        boolean z2 = false;
        boolean z10 = true;
        ExceptionsCollector exceptionsCollector = new ExceptionsCollector(0, 1, null);
        Path fileName = path.getFileName();
        if (fileName != null) {
            Path parent = path.getParent();
            if (parent == null) {
                parent = path.getFileSystem().getPath("", new String[0]);
            }
            try {
                directoryStream = Files.newDirectoryStream(parent);
            } catch (Throwable unused) {
                directoryStream = null;
            }
            if (directoryStream != null) {
                try {
                    if (directoryStream instanceof SecureDirectoryStream) {
                        exceptionsCollector.setPath(parent);
                        handleEntry$PathsKt__PathRecursiveFunctionsKt((SecureDirectoryStream) directoryStream, fileName, null, exceptionsCollector);
                    } else {
                        z2 = true;
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(directoryStream, null);
                    z10 = z2;
                } finally {
                }
            }
        }
        if (z10) {
            insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt(path, null, exceptionsCollector);
        }
        return exceptionsCollector.getCollectedExceptions();
    }

    private static final void enterDirectory$PathsKt__PathRecursiveFunctionsKt(SecureDirectoryStream<Path> secureDirectoryStream, Path path, ExceptionsCollector exceptionsCollector) {
        SecureDirectoryStream<Path> secureDirectoryStream2;
        try {
            try {
                secureDirectoryStream2 = secureDirectoryStream.newDirectoryStream(path, LinkOption.NOFOLLOW_LINKS);
            } catch (Exception e10) {
                exceptionsCollector.collect(e10);
                return;
            }
        } catch (NoSuchFileException unused) {
            secureDirectoryStream2 = null;
        }
        if (secureDirectoryStream2 == null) {
            return;
        }
        try {
            Iterator<Path> it = secureDirectoryStream2.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                Path fileName = it.next().getFileName();
                Intrinsics.checkNotNullExpressionValue(fileName, "getFileName(...)");
                handleEntry$PathsKt__PathRecursiveFunctionsKt(secureDirectoryStream2, fileName, exceptionsCollector.getPath(), exceptionsCollector);
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(secureDirectoryStream2, null);
        } finally {
        }
    }

    private static final void handleEntry$PathsKt__PathRecursiveFunctionsKt(SecureDirectoryStream<Path> secureDirectoryStream, Path path, Path path2, ExceptionsCollector exceptionsCollector) {
        exceptionsCollector.enterEntry(path);
        if (path2 != null) {
            try {
                Path path3 = exceptionsCollector.getPath();
                Intrinsics.checkNotNull(path3);
                checkFileName(path3);
                checkNotSameAs$PathsKt__PathRecursiveFunctionsKt(path3, path2);
            } catch (Exception e10) {
                exceptionsCollector.collect(e10);
            }
        }
        if (isDirectory$PathsKt__PathRecursiveFunctionsKt(secureDirectoryStream, path, LinkOption.NOFOLLOW_LINKS)) {
            int totalExceptions = exceptionsCollector.getTotalExceptions();
            enterDirectory$PathsKt__PathRecursiveFunctionsKt(secureDirectoryStream, path, exceptionsCollector);
            if (totalExceptions == exceptionsCollector.getTotalExceptions()) {
                secureDirectoryStream.deleteDirectory(path);
                Unit unit = Unit.INSTANCE;
            }
            exceptionsCollector.exitEntry(path);
        }
        secureDirectoryStream.deleteFile(path);
        Unit unit2 = Unit.INSTANCE;
        exceptionsCollector.exitEntry(path);
    }

    private static final void insecureEnterDirectory$PathsKt__PathRecursiveFunctionsKt(Path path, ExceptionsCollector exceptionsCollector) {
        DirectoryStream<Path> directoryStream;
        try {
            try {
                directoryStream = Files.newDirectoryStream(path);
            } catch (Exception e10) {
                exceptionsCollector.collect(e10);
                return;
            }
        } catch (NoSuchFileException unused) {
            directoryStream = null;
        }
        if (directoryStream == null) {
            return;
        }
        try {
            Iterator<Path> it = directoryStream.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                Path next = it.next();
                Intrinsics.checkNotNull(next);
                insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt(next, path, exceptionsCollector);
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(directoryStream, null);
        } finally {
        }
    }

    private static final void insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt(Path path, Path path2, ExceptionsCollector exceptionsCollector) {
        if (path2 != null) {
            try {
                checkFileName(path);
                checkNotSameAs$PathsKt__PathRecursiveFunctionsKt(path, path2);
            } catch (Exception e10) {
                exceptionsCollector.collect(e10);
                return;
            }
        }
        if (!Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
            Files.deleteIfExists(path);
            return;
        }
        int totalExceptions = exceptionsCollector.getTotalExceptions();
        insecureEnterDirectory$PathsKt__PathRecursiveFunctionsKt(path, exceptionsCollector);
        if (totalExceptions == exceptionsCollector.getTotalExceptions()) {
            Files.deleteIfExists(path);
        }
    }

    private static final boolean isDirectory$PathsKt__PathRecursiveFunctionsKt(SecureDirectoryStream<Path> secureDirectoryStream, Path path, LinkOption... linkOptionArr) {
        Boolean bool;
        try {
            bool = Boolean.valueOf(((BasicFileAttributeView) secureDirectoryStream.getFileAttributeView(path, BasicFileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))).readAttributes().isDirectory());
        } catch (NoSuchFileException unused) {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @ExperimentalPathApi
    private static final FileVisitResult toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(CopyActionResult copyActionResult) {
        int i3 = WhenMappings.$EnumSwitchMapping$0[copyActionResult.ordinal()];
        if (i3 == 1) {
            return FileVisitResult.CONTINUE;
        }
        if (i3 == 2) {
            return FileVisitResult.TERMINATE;
        }
        if (i3 == 3) {
            return FileVisitResult.SKIP_SUBTREE;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final <R> R tryIgnoreNoSuchFileException$PathsKt__PathRecursiveFunctionsKt(Function0<? extends R> function0) {
        try {
            return function0.invoke();
        } catch (NoSuchFileException unused) {
            return null;
        }
    }

    @SinceKotlin(version = "1.8")
    @ExperimentalPathApi
    public static final Path copyToRecursively(final Path path, final Path target, final Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> onError, boolean z2, final Function3<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult> copyAction) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(copyAction, "copyAction");
        LinkOption[] linkOptions = LinkFollowing.INSTANCE.toLinkOptions(z2);
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptions, linkOptions.length);
        if (Files.exists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
            boolean z10 = false;
            if (Files.exists(path, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && (z2 || !Files.isSymbolicLink(path))) {
                boolean z11 = Files.exists(target, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && !Files.isSymbolicLink(target);
                if (!z11 || !Files.isSameFile(path, target)) {
                    if (Intrinsics.areEqual(path.getFileSystem(), target.getFileSystem())) {
                        if (z11) {
                            z10 = target.toRealPath(new LinkOption[0]).startsWith(path.toRealPath(new LinkOption[0]));
                        } else {
                            Path parent = target.getParent();
                            if (parent != null && Files.exists(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && parent.toRealPath(new LinkOption[0]).startsWith(path.toRealPath(new LinkOption[0]))) {
                                z10 = true;
                            }
                        }
                    }
                    if (z10) {
                        throw new FileSystemException(path.toString(), target.toString(), "Recursively copying a directory into its subdirectory is prohibited.");
                    }
                }
            }
            final Path normalize = target.normalize();
            final ArrayList arrayList = new ArrayList();
            PathsKt__PathUtilsKt.visitFileTree$default(path, 0, z2, new Function1() { // from class: kotlin.io.path.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit copyToRecursively$lambda$3$PathsKt__PathRecursiveFunctionsKt;
                    ArrayList arrayList2 = arrayList;
                    Path path2 = target;
                    Path path3 = normalize;
                    copyToRecursively$lambda$3$PathsKt__PathRecursiveFunctionsKt = PathsKt__PathRecursiveFunctionsKt.copyToRecursively$lambda$3$PathsKt__PathRecursiveFunctionsKt(arrayList2, copyAction, path, path2, path3, onError, (FileVisitorBuilder) obj);
                    return copyToRecursively$lambda$3$PathsKt__PathRecursiveFunctionsKt;
                }
            }, 1, (Object) null);
            return target;
        }
        throw new NoSuchFileException(path.toString(), target.toString(), "The source file doesn't exist.");
    }

    public static /* synthetic */ Path copyToRecursively$default(Path path, Path path2, Function3 function3, boolean z2, Function3 function32, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            function3 = new Function3() { // from class: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$3
                @Override // kotlin.jvm.functions.Function3
                public final Void invoke(Path path3, Path path4, Exception exception) {
                    Intrinsics.checkNotNullParameter(path3, "<unused var>");
                    Intrinsics.checkNotNullParameter(path4, "<unused var>");
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    throw exception;
                }
            };
        }
        if ((i3 & 8) != 0) {
            function32 = new a(z2, 0);
        }
        return copyToRecursively(path, path2, (Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult>) function3, z2, (Function3<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult>) function32);
    }

    @ExperimentalPathApi
    private static final FileVisitResult toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(OnErrorResult onErrorResult) {
        int i3 = WhenMappings.$EnumSwitchMapping$1[onErrorResult.ordinal()];
        if (i3 == 1) {
            return FileVisitResult.TERMINATE;
        }
        if (i3 == 2) {
            return FileVisitResult.SKIP_SUBTREE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
