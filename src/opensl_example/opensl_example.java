/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package opensl_example;

public class opensl_example {
  public static void start(int audio_track_min_buf_size, int audio_record_min_buf_size, int playback_delay_ms, int echo_delay_ms, int _dump_raw, int is_aec_available) {
    opensl_exampleJNI.start(audio_track_min_buf_size, audio_record_min_buf_size, playback_delay_ms, echo_delay_ms, _dump_raw, is_aec_available);
  }

  public static void runNearendProcessing() {
    opensl_exampleJNI.runNearendProcessing();
  }

  public static void stop() {
    opensl_exampleJNI.stop();
  }

  public static int push(short[] buf) {
    return opensl_exampleJNI.push(buf);
  }

  public static int pull(short[] buf) {
    return opensl_exampleJNI.pull(buf);
  }

  public static int estimate_delay(int use_mem_data) {
    return opensl_exampleJNI.estimate_delay(use_mem_data);
  }

  public static int get_estimated_echo_delay() {
    return opensl_exampleJNI.get_estimated_echo_delay();
  }

  public static void offline_process() {
    opensl_exampleJNI.offline_process();
  }

}
