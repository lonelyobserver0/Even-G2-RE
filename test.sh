for image_field_number in 3 4 5 6; do
    for compression_mode in 0 1 2; do
      echo "image=$image_field_number compression=$compression_mode"
      python /home/loneobs/Code/Even/RE/even-apks/base/send_image_real.py \
        --mode proto-map \
        --all-lenses \
        --scan-timeout 10 \
        --dashboard-wrapper-field 3 \
        --app-request-field 1 \
        --command-data-field 1 \
        --image-field-number "$image_field_number" \
        --compression-mode "$compression_mode" \
        --width 8 \
        --height 8 \
        /home/loneobs/Code/Even/RE/even-apks/base/test.png
      sleep 2
    done
  done