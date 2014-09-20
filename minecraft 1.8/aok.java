/*  1:   */ import com.google.common.collect.Maps;
/*  2:   */ import java.util.Map;
/*  3:   */ import java.util.Map.Entry;
/*  4:   */ 
/*  5:   */ public class aok
/*  6:   */ {
/*  7:13 */   private static final aok a = new aok();
/*  8:15 */   private Map b = Maps.newHashMap();
/*  9:16 */   private Map c = Maps.newHashMap();
/* 10:   */   
/* 11:   */   public static aok a()
/* 12:   */   {
/* 13:19 */     return a;
/* 14:   */   }
/* 15:   */   
/* 16:   */   private aok()
/* 17:   */   {
/* 18:23 */     a(aty.p, new amj(amk.j), 0.7F);
/* 19:24 */     a(aty.o, new amj(amk.k), 1.0F);
/* 20:25 */     a(aty.ag, new amj(amk.i), 1.0F);
/* 21:26 */     a(aty.m, new amj(aty.w), 0.1F);
/* 22:   */     
/* 23:   */ 
/* 24:29 */     a(amk.al, new amj(amk.am), 0.35F);
/* 25:30 */     a(amk.bi, new amj(amk.bj), 0.35F);
/* 26:31 */     a(amk.bk, new amj(amk.bl), 0.35F);
/* 27:32 */     a(amk.bo, new amj(amk.bp), 0.35F);
/* 28:33 */     a(amk.bm, new amj(amk.bn), 0.35F);
/* 29:34 */     a(aty.e, new amj(aty.b), 0.1F);
/* 30:35 */     a(new amj(aty.bf, 1, bbc.b), new amj(aty.bf, 1, bbc.N), 0.1F);
/* 31:36 */     a(amk.aI, new amj(amk.aH), 0.3F);
/* 32:37 */     a(aty.aL, new amj(aty.cz), 0.35F);
/* 33:38 */     a(aty.aK, new amj(amk.aW, 1, akv.n.b()), 0.2F);
/* 34:39 */     a(aty.r, new amj(amk.h, 1, 1), 0.15F);
/* 35:40 */     a(aty.s, new amj(amk.h, 1, 1), 0.15F);
/* 36:41 */     a(aty.bP, new amj(amk.bO), 1.0F);
/* 37:42 */     a(amk.bS, new amj(amk.bT), 0.35F);
/* 38:43 */     a(aty.aV, new amj(amk.cf), 0.1F);
/* 39:44 */     a(new amj(aty.v, 1, 1), new amj(aty.v, 1, 0), 0.15F);
/* 40:46 */     for (ali localali : ali.values()) {
/* 41:47 */       if (localali.g()) {
/* 42:48 */         a(new amj(amk.aU, 1, localali.a()), new amj(amk.aV, 1, localali.a()), 0.35F);
/* 43:   */       }
/* 44:   */     }
/* 45:54 */     a(aty.q, new amj(amk.h), 0.1F);
/* 46:55 */     a(aty.aC, new amj(amk.aC), 0.7F);
/* 47:   */     
/* 48:57 */     a(aty.x, new amj(amk.aW, 1, akv.l.b()), 0.2F);
/* 49:58 */     a(aty.co, new amj(amk.cg), 0.2F);
/* 50:   */   }
/* 51:   */   
/* 52:   */   public void a(atr paramatr, amj paramamj, float paramFloat)
/* 53:   */   {
/* 54:62 */     a(alq.a(paramatr), paramamj, paramFloat);
/* 55:   */   }
/* 56:   */   
/* 57:   */   public void a(alq paramalq, amj paramamj, float paramFloat)
/* 58:   */   {
/* 59:66 */     a(new amj(paramalq, 1, 32767), paramamj, paramFloat);
/* 60:   */   }
/* 61:   */   
/* 62:   */   public void a(amj paramamj1, amj paramamj2, float paramFloat)
/* 63:   */   {
/* 64:70 */     this.b.put(paramamj1, paramamj2);
/* 65:71 */     this.c.put(paramamj2, Float.valueOf(paramFloat));
/* 66:   */   }
/* 67:   */   
/* 68:   */   public amj a(amj paramamj)
/* 69:   */   {
/* 70:75 */     for (Map.Entry localEntry : this.b.entrySet()) {
/* 71:76 */       if (a(paramamj, (amj)localEntry.getKey())) {
/* 72:77 */         return (amj)localEntry.getValue();
/* 73:   */       }
/* 74:   */     }
/* 75:81 */     return null;
/* 76:   */   }
/* 77:   */   
/* 78:   */   private boolean a(amj paramamj1, amj paramamj2)
/* 79:   */   {
/* 80:85 */     return (paramamj2.b() == paramamj1.b()) && ((paramamj2.i() == 32767) || (paramamj2.i() == paramamj1.i()));
/* 81:   */   }
/* 82:   */   
/* 83:   */   public Map b()
/* 84:   */   {
/* 85:89 */     return this.b;
/* 86:   */   }
/* 87:   */   
/* 88:   */   public float b(amj paramamj)
/* 89:   */   {
/* 90:93 */     for (Map.Entry localEntry : this.c.entrySet()) {
/* 91:94 */       if (a(paramamj, (amj)localEntry.getKey())) {
/* 92:95 */         return ((Float)localEntry.getValue()).floatValue();
/* 93:   */       }
/* 94:   */     }
/* 95:98 */     return 0.0F;
/* 96:   */   }
/* 97:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aok
 * JD-Core Version:    0.7.0.1
 */