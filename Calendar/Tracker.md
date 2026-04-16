
```dataviewjs
const trackerData = {
    year: 2026,
    entries: [],
    heatmapTitle: "💪Workout Tracker",
    colorScheme: {
        paletteName: "tiaoseban"
    }
}

for(let page of dv.pages('"Calendar/Journal/Daily"').where(p => p.workout)) {
    trackerData.entries.push({
        date: page.file.name,
        intensity: 1
    })
}

renderHeatmapTracker(this.container, trackerData)
```

```dataviewjs
const trackerData = {
    year: 2026,
    entries: [],
    heatmapTitle: "📕Java Tracker",
    colorScheme: {
        paletteName: "tiaoseban"
    }
}

for(let page of dv.pages('"Calendar/Journal/Daily"').where(p => p.java)) {
    trackerData.entries.push({
        date: page.file.name,
        intensity: 1
    })
}

renderHeatmapTracker(this.container, trackerData)
```

```dataviewjs
const trackerData = {
    year: 2026,
    entries: [],
    heatmapTitle: "📕English Words Tracker",
    colorScheme: {
        paletteName: "tiaoseban"
    }
}

for(let page of dv.pages('"Calendar/Journal/Daily"').where(p => p.words)) {
    trackerData.entries.push({
        date: page.file.name,
        intensity: 1
    })
}

renderHeatmapTracker(this.container, trackerData)
```