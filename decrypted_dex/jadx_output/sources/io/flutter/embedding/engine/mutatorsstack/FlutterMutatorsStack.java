package io.flutter.embedding.engine.mutatorsstack;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.Keep;
import cb.C0585c;
import java.util.ArrayList;
import java.util.List;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class FlutterMutatorsStack {
    private List<C0585c> mutators = new ArrayList();
    private Matrix finalMatrix = new Matrix();
    private List<Path> finalClippingPaths = new ArrayList();
    private float finalOpacity = 1.0f;

    public List<Path> getFinalClippingPaths() {
        return this.finalClippingPaths;
    }

    public Matrix getFinalMatrix() {
        return this.finalMatrix;
    }

    public float getFinalOpacity() {
        return this.finalOpacity;
    }

    public List<C0585c> getMutators() {
        return this.mutators;
    }

    public void pushClipPath(Path path) {
        this.mutators.add(new C0585c(0));
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushClipRRect(int i3, int i10, int i11, int i12, float[] fArr) {
        Rect rect = new Rect(i3, i10, i11, i12);
        this.mutators.add(new C0585c(0));
        Path path = new Path();
        path.addRoundRect(new RectF(rect), fArr, Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushClipRect(int i3, int i10, int i11, int i12) {
        Rect rect = new Rect(i3, i10, i11, i12);
        this.mutators.add(new C0585c(0));
        Path path = new Path();
        path.addRect(new RectF(rect), Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushOpacity(float f10) {
        this.mutators.add(new C0585c(0));
        this.finalOpacity *= f10;
    }

    public void pushTransform(float[] fArr) {
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        this.mutators.add(new C0585c(0));
        this.finalMatrix.preConcat(matrix);
    }
}
