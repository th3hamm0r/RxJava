package rx.internal.util.unsafe;

/**
 * Created by stefan on 17.03.17.
 */
abstract class SpscArrayQueueL3Pad<E> extends SpscArrayQueueConsumerField<E> {
    long p40, p41, p42, p43, p44, p45, p46;
    long p30, p31, p32, p33, p34, p35, p36, p37;

    public SpscArrayQueueL3Pad(int capacity) {
        super(capacity);
    }
}
