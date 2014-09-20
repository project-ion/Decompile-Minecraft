/*  1:   */ import com.google.common.collect.Maps;
/*  2:   */ import java.util.Map;
/*  3:   */ 
/*  4:   */ public class buc
/*  5:   */ {
/*  6:20 */   private static final oa a = new oa("textures/map/map_icons.png");
/*  7:   */   private final cug b;
/*  8:24 */   private final Map c = Maps.newHashMap();
/*  9:   */   
/* 10:   */   public buc(cug paramcug)
/* 11:   */   {
/* 12:27 */     this.b = paramcug;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void a(bqe parambqe)
/* 16:   */   {
/* 17:31 */     bue.a(b(parambqe));
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void a(bqe parambqe, boolean paramBoolean)
/* 21:   */   {
/* 22:35 */     bue.a(b(parambqe), paramBoolean);
/* 23:   */   }
/* 24:   */   
/* 25:   */   private bue b(bqe parambqe)
/* 26:   */   {
/* 27:39 */     bue localbue = (bue)this.c.get(parambqe.a);
/* 28:41 */     if (localbue == null)
/* 29:   */     {
/* 30:42 */       localbue = new bue(this, parambqe, null);
/* 31:43 */       this.c.put(parambqe.a, localbue);
/* 32:   */     }
/* 33:45 */     return localbue;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void a()
/* 37:   */   {
/* 38:49 */     for (bue localbue : this.c.values()) {
/* 39:50 */       this.b.c(bue.b(localbue));
/* 40:   */     }
/* 41:53 */     this.c.clear();
/* 42:   */   }
/* 43:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     buc
 * JD-Core Version:    0.7.0.1
 */