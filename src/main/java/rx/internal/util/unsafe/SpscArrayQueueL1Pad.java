package rx.internal.util.unsafe;

/**
 * Created by stefan on 17.03.17.
 */
abstract class SpscArrayQueueL1Pad<E> extends SpscArrayQueueColdField<E> {
    long p10, p11, p12, p13, p14, p15, p16;
    long p30, p31, p32, p33, p34, p35, p36, p37;

    public SpscArrayQueueL1Pad(int capacity) {
        super(capacity);
    }
}
