/*  1:   */ import com.google.common.collect.Maps;
/*  2:   */ import java.util.Map;
/*  3:   */ import java.util.Map.Entry;
/*  4:   */ 
/*  5:   */ public class ckk
/*  6:   */ {
/*  7:15 */   private final Map a = Maps.newHashMap();
/*  8:16 */   private final Map b = Maps.newHashMap();
/*  9:17 */   private final Map c = Maps.newHashMap();
/* 10:   */   private final cxk d;
/* 11:   */   
/* 12:   */   public ckk(cxk paramcxk)
/* 13:   */   {
/* 14:21 */     this.d = paramcxk;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public cue a(alq paramalq)
/* 18:   */   {
/* 19:25 */     return a(paramalq, 0);
/* 20:   */   }
/* 21:   */   
/* 22:   */   public cue a(alq paramalq, int paramInt)
/* 23:   */   {
/* 24:29 */     return a(new amj(paramalq, 1, paramInt)).e();
/* 25:   */   }
/* 26:   */   
/* 27:   */   public cxe a(amj paramamj)
/* 28:   */   {
/* 29:33 */     alq localalq = paramamj.b();
/* 30:   */     
/* 31:35 */     cxe localcxe = b(localalq, b(paramamj));
/* 32:36 */     if (localcxe == null)
/* 33:   */     {
/* 34:37 */       ckl localckl = (ckl)this.c.get(localalq);
/* 35:38 */       if (localckl != null) {
/* 36:39 */         localcxe = this.d.a(localckl.a(paramamj));
/* 37:   */       }
/* 38:   */     }
/* 39:42 */     if (localcxe == null) {
/* 40:43 */       localcxe = this.d.a();
/* 41:   */     }
/* 42:46 */     return localcxe;
/* 43:   */   }
/* 44:   */   
/* 45:   */   protected int b(amj paramamj)
/* 46:   */   {
/* 47:50 */     return paramamj.e() ? 0 : paramamj.i();
/* 48:   */   }
/* 49:   */   
/* 50:   */   protected cxe b(alq paramalq, int paramInt)
/* 51:   */   {
/* 52:55 */     return (cxe)this.b.get(Integer.valueOf(c(paramalq, paramInt)));
/* 53:   */   }
/* 54:   */   
/* 55:   */   private int c(alq paramalq, int paramInt)
/* 56:   */   {
/* 57:59 */     return alq.b(paramalq) << 16 | paramInt;
/* 58:   */   }
/* 59:   */   
/* 60:   */   public void a(alq paramalq, int paramInt, cxl paramcxl)
/* 61:   */   {
/* 62:63 */     this.a.put(Integer.valueOf(c(paramalq, paramInt)), paramcxl);
/* 63:64 */     this.b.put(Integer.valueOf(c(paramalq, paramInt)), this.d.a(paramcxl));
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void a(alq paramalq, ckl paramckl)
/* 67:   */   {
/* 68:68 */     this.c.put(paramalq, paramckl);
/* 69:   */   }
/* 70:   */   
/* 71:   */   public cxk a()
/* 72:   */   {
/* 73:72 */     return this.d;
/* 74:   */   }
/* 75:   */   
/* 76:   */   public void b()
/* 77:   */   {
/* 78:76 */     this.b.clear();
/* 79:77 */     for (Map.Entry localEntry : this.a.entrySet()) {
/* 80:78 */       this.b.put(localEntry.getKey(), this.d.a((cxl)localEntry.getValue()));
/* 81:   */     }
/* 82:   */   }
/* 83:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ckk
 * JD-Core Version:    0.7.0.1
 */