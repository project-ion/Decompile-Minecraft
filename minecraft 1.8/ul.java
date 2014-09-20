/*  1:   */ import com.google.common.collect.Maps;
/*  2:   */ import java.util.Collection;
/*  3:   */ import java.util.Map;
/*  4:   */ import java.util.Map.Entry;
/*  5:   */ import java.util.Set;
/*  6:   */ 
/*  7:   */ public class ul
/*  8:   */   implements Map
/*  9:   */ {
/* 10:10 */   private final Map a = Maps.newLinkedHashMap();
/* 11:   */   
/* 12:   */   public int size()
/* 13:   */   {
/* 14:14 */     return this.a.size();
/* 15:   */   }
/* 16:   */   
/* 17:   */   public boolean isEmpty()
/* 18:   */   {
/* 19:19 */     return this.a.isEmpty();
/* 20:   */   }
/* 21:   */   
/* 22:   */   public boolean containsKey(Object paramObject)
/* 23:   */   {
/* 24:24 */     return this.a.containsKey(paramObject.toString().toLowerCase());
/* 25:   */   }
/* 26:   */   
/* 27:   */   public boolean containsValue(Object paramObject)
/* 28:   */   {
/* 29:29 */     return this.a.containsKey(paramObject);
/* 30:   */   }
/* 31:   */   
/* 32:   */   public Object get(Object paramObject)
/* 33:   */   {
/* 34:34 */     return this.a.get(paramObject.toString().toLowerCase());
/* 35:   */   }
/* 36:   */   
/* 37:   */   public Object a(String paramString, Object paramObject)
/* 38:   */   {
/* 39:39 */     return this.a.put(paramString.toLowerCase(), paramObject);
/* 40:   */   }
/* 41:   */   
/* 42:   */   public Object remove(Object paramObject)
/* 43:   */   {
/* 44:44 */     return this.a.remove(paramObject.toString().toLowerCase());
/* 45:   */   }
/* 46:   */   
/* 47:   */   public void putAll(Map paramMap)
/* 48:   */   {
/* 49:49 */     for (Map.Entry localEntry : paramMap.entrySet()) {
/* 50:50 */       a((String)localEntry.getKey(), localEntry.getValue());
/* 51:   */     }
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void clear()
/* 55:   */   {
/* 56:56 */     this.a.clear();
/* 57:   */   }
/* 58:   */   
/* 59:   */   public Set keySet()
/* 60:   */   {
/* 61:61 */     return this.a.keySet();
/* 62:   */   }
/* 63:   */   
/* 64:   */   public Collection values()
/* 65:   */   {
/* 66:66 */     return this.a.values();
/* 67:   */   }
/* 68:   */   
/* 69:   */   public Set entrySet()
/* 70:   */   {
/* 71:71 */     return this.a.entrySet();
/* 72:   */   }
/* 73:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ul
 * JD-Core Version:    0.7.0.1
 */