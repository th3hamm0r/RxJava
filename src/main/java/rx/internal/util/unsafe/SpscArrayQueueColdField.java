package rx.internal.util.unsafe;

/**
 * Created by stefan on 17.03.17.
 */
abstract class SpscArrayQueueColdField<E> extends ConcurrentCircularArrayQueue<E> {
    private static final Integer MAX_LOOK_AHEAD_STEP = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    protected final int lookAheadStep;
    public SpscArrayQueueColdField(int capacity) {
        super(capacity);
        lookAheadStep = Math.min(capacity/4, MAX_LOOK_AHEAD_STEP);
    }
}
