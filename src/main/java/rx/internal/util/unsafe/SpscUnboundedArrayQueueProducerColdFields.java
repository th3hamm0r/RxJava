package rx.internal.util.unsafe;

/**
 * Created by stefan on 17.03.17.
 */
abstract class SpscUnboundedArrayQueueProducerColdFields<E> extends SpscUnboundedArrayQueueProducerFields<E> {
    protected int producerLookAheadStep;
    protected long producerLookAhead;
    protected long producerMask;
    protected E[] producerBuffer;
}
