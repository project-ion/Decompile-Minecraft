/*  1:   */ import com.google.common.collect.Maps;
/*  2:   */ import java.util.Collection;
/*  3:   */ import java.util.Collections;
/*  4:   */ import java.util.Iterator;
/*  5:   */ import java.util.Map;
/*  6:   */ import java.util.Set;
/*  7:   */ import org.apache.commons.lang3.Validate;
/*  8:   */ import org.apache.logging.log4j.LogManager;
/*  9:   */ import org.apache.logging.log4j.Logger;
/* 10:   */ 
/* 11:   */ public class fb
/* 12:   */   implements ez
/* 13:   */ {
/* 14:15 */   private static final Logger a = ;
/* 15:16 */   protected final Map c = b();
/* 16:   */   
/* 17:   */   protected Map b()
/* 18:   */   {
/* 19:19 */     return Maps.newHashMap();
/* 20:   */   }
/* 21:   */   
/* 22:   */   public Object a(Object paramObject)
/* 23:   */   {
/* 24:24 */     return this.c.get(paramObject);
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void a(Object paramObject1, Object paramObject2)
/* 28:   */   {
/* 29:29 */     Validate.notNull(paramObject1);
/* 30:30 */     Validate.notNull(paramObject2);
/* 31:32 */     if (this.c.containsKey(paramObject1)) {
/* 32:33 */       a.debug("Adding duplicate key '" + paramObject1 + "' to registry");
/* 33:   */     }
/* 34:35 */     this.c.put(paramObject1, paramObject2);
/* 35:   */   }
/* 36:   */   
/* 37:   */   public Set c()
/* 38:   */   {
/* 39:40 */     return Collections.unmodifiableSet(this.c.keySet());
/* 40:   */   }
/* 41:   */   
/* 42:   */   public boolean d(Object paramObject)
/* 43:   */   {
/* 44:44 */     return this.c.containsKey(paramObject);
/* 45:   */   }
/* 46:   */   
/* 47:   */   public Iterator iterator()
/* 48:   */   {
/* 49:49 */     return this.c.values().iterator();
/* 50:   */   }
/* 51:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     fb
 * JD-Core Version:    0.7.0.1
 */