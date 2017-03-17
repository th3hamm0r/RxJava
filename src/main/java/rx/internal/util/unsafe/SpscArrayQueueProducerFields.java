package rx.internal.util.unsafe;

import rx.internal.util.SuppressAnimalSniffer;

/**
 * Created by stefan on 17.03.17.
 */
@SuppressAnimalSniffer
abstract class SpscArrayQueueProducerFields<E> extends SpscArrayQueueL1Pad<E> {
    protected final static long P_INDEX_OFFSET = UnsafeAccess.addressOf(SpscArrayQueueProducerFields.class, "producerIndex");
    protected long producerIndex;
    protected long producerLookAhead;

    public SpscArrayQueueProducerFields(int capacity) {
        super(capacity);
    }
}
