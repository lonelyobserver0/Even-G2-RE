package kotlin.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0017\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u001e\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n\u001a\u0010\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r*\u00020\u0002\u001aB\u0010\u000e\u001a\u0002H\u000f\"\u0004\b\u0000\u0010\u000f*\u00020\u00022\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0011\u0012\u0004\u0012\u0002H\u000f0\nH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0014*\u00020\u000bH\u0087\b\u001a\u0010\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011*\u00020\u0001\u001a\n\u0010\u0016\u001a\u00020\u000b*\u00020\u0002\u001a\u001c\u0010\u0017\u001a\u00020\u0018*\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u0017\u0010\u0016\u001a\u00020\u000b*\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0087\b\u001a\n\u0010\u001d\u001a\u00020\u001e*\u00020\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, d2 = {"buffered", "Ljava/io/BufferedReader;", "Ljava/io/Reader;", "bufferSize", "", "Ljava/io/BufferedWriter;", "Ljava/io/Writer;", "forEachLine", "", "action", "Lkotlin/Function1;", "", "readLines", "", "useLines", "T", "block", "Lkotlin/sequences/Sequence;", "(Ljava/io/Reader;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "reader", "Ljava/io/StringReader;", "lineSequence", "readText", "copyTo", "", "out", "Ljava/net/URL;", "charset", "Ljava/nio/charset/Charset;", "readBytes", "", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
@JvmName(name = "TextStreamsKt")
@SourceDebugExtension({"SMAP\nReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,157:1\n57#1:158\n1#2:159\n1#2:162\n1321#3,2:160\n*S KotlinDebug\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n*L\n35#1:158\n35#1:159\n35#1:160,2\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class TextStreamsKt {
    @InlineOnly
    private static final BufferedReader buffered(Reader reader, int i3) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i3);
    }

    public static /* synthetic */ BufferedReader buffered$default(Reader reader, int i3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i3 = 8192;
        }
        Intrinsics.checkNotNullParameter(reader, "<this>");
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i3);
    }

    public static final long copyTo(Reader reader, Writer out, int i3) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        char[] cArr = new char[i3];
        int read = reader.read(cArr);
        long j = 0;
        while (read >= 0) {
            out.write(cArr, 0, read);
            j += read;
            read = reader.read(cArr);
        }
        return j;
    }

    public static /* synthetic */ long copyTo$default(Reader reader, Writer writer, int i3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i3 = 8192;
        }
        return copyTo(reader, writer, i3);
    }

    public static final void forEachLine(Reader reader, Function1<? super String, Unit> action) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            Iterator<String> it = lineSequence(bufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(bufferedReader, null);
        } finally {
        }
    }

    public static final Sequence<String> lineSequence(BufferedReader bufferedReader) {
        Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
        return SequencesKt.constrainOnce(new LinesSequence(bufferedReader));
    }

    public static final byte[] readBytes(URL url) {
        Intrinsics.checkNotNullParameter(url, "<this>");
        InputStream openStream = url.openStream();
        try {
            Intrinsics.checkNotNull(openStream);
            byte[] readBytes = ByteStreamsKt.readBytes(openStream);
            CloseableKt.closeFinally(openStream, null);
            return readBytes;
        } finally {
        }
    }

    public static final List<String> readLines(Reader reader) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        ArrayList arrayList = new ArrayList();
        forEachLine(reader, new a(1, arrayList));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit readLines$lambda$0(ArrayList arrayList, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        arrayList.add(it);
        return Unit.INSTANCE;
    }

    public static final String readText(Reader reader) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        copyTo$default(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(stringWriter2, "toString(...)");
        return stringWriter2;
    }

    public static /* synthetic */ String readText$default(URL url, Charset charset, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(url, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(readBytes(url), charset);
    }

    @InlineOnly
    private static final StringReader reader(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new StringReader(str);
    }

    public static final <T> T useLines(Reader reader, Function1<? super Sequence<String>, ? extends T> block) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            T invoke = block.invoke(lineSequence(bufferedReader));
            InlineMarker.finallyStart(1);
            CloseableKt.closeFinally(bufferedReader, null);
            InlineMarker.finallyEnd(1);
            return invoke;
        } finally {
        }
    }

    @InlineOnly
    private static final BufferedWriter buffered(Writer writer, int i3) {
        Intrinsics.checkNotNullParameter(writer, "<this>");
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i3);
    }

    public static /* synthetic */ BufferedWriter buffered$default(Writer writer, int i3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i3 = 8192;
        }
        Intrinsics.checkNotNullParameter(writer, "<this>");
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i3);
    }

    @InlineOnly
    private static final String readText(URL url, Charset charset) {
        Intrinsics.checkNotNullParameter(url, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(readBytes(url), charset);
    }
}
