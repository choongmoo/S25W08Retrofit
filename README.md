# 스마트 앱 프로그래밍 2025

# Week 08. Retrofit

https://nano5.notion.site/Retrofit-225daf211d42812b9abbfffaf56e72ba?source=copy_link

```mermaid
graph TD
    subgraph "View Layer (UI)"
        UI["🖼️ Jetpack Compose UI\n(Material3 Design)"]
        Coil["🖼️ Coil3\n(Image Loading)"]
    end

    subgraph "ViewModel Layer"
        VM["🧠 ViewModel\n(State Holder & Logic)"]
    end

    subgraph "Model Layer (Data)"
        Repo["📦 Repository\n(Single Source of Truth)"]
        Network["🌐 Retrofit2 Interface\n+ OkHttp3 Client"]
    end

    subgraph "External Cloud"
        Supabase[("☁️ Supabase Cloud DB\n(PostgreSQL)")]
    end

    %% Relationships
    UI <==>|State & Events| VM
    VM <==>|Data Requests & Result| Repo
    Repo <==>|API Calls| Network
    Network <==>|HTTPS / JSON| Supabase
    
    %% Coil connection
    Coil -.->|Loads Images into| UI

    %% Styling
    classDef viewLayer fill:#e3f2fd,stroke:#1565c0,stroke-width:2px;
    classDef vmLayer fill:#fff3e0,stroke:#ef6c00,stroke-width:2px;
    classDef modelLayer fill:#e8f5e9,stroke:#2e7d32,stroke-width:2px;
    classDef cloudLayer fill:#f3e5f5,stroke:#7b1fa2,stroke-width:2px,stroke-dasharray: 5 5;
    
    class UI,Coil viewLayer;
    class VM vmLayer;
    class Repo,Network modelLayer;
    class Supabase cloudLayer;
