package com.gmail.woodyc40.dabble.context;

import com.gmail.woodyc40.dabble.lexing.Sentence;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.annotation.concurrent.NotThreadSafe;
import java.util.HashMap;
import java.util.Map;

@NotThreadSafe
@RequiredArgsConstructor
public class ContextProcessor {
    @Getter private static final Map<Class<? extends RelevanceIndexer>, RelevanceIndexer> indexers =
            new HashMap<>();

    @Getter private double relevance;
    @Getter private final Sentence base;

    public void process(Sentence sentence) {
        for (RelevanceIndexer indexer : indexers.values()) {
            this.relevance += indexer.index();
        }
    }
}