/*  1:   */ import net.minecraft.server.MinecraftServer;
/*  2:   */ 
/*  3:   */ public class qp
/*  4:   */   implements ara
/*  5:   */ {
/*  6:   */   private MinecraftServer a;
/*  7:   */   private qt b;
/*  8:   */   
/*  9:   */   public qp(MinecraftServer paramMinecraftServer, qt paramqt)
/* 10:   */   {
/* 11:16 */     this.a = paramMinecraftServer;
/* 12:17 */     this.b = paramqt;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void a(int paramInt, boolean paramBoolean, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, int... paramVarArgs) {}
/* 16:   */   
/* 17:   */   public void a(wv paramwv)
/* 18:   */   {
/* 19:30 */     this.b.s().a(paramwv);
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void b(wv paramwv)
/* 23:   */   {
/* 24:35 */     this.b.s().b(paramwv);
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void a(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/* 28:   */   {
/* 29:40 */     this.a.an().a(paramDouble1, paramDouble2, paramDouble3, paramFloat1 > 1.0F ? 16.0F * paramFloat1 : 16.0D, this.b.t.q(), new jv(paramString, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2));
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void a(ahd paramahd, String paramString, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/* 33:   */   {
/* 34:45 */     this.a.an().a(paramahd, paramDouble1, paramDouble2, paramDouble3, paramFloat1 > 1.0F ? 16.0F * paramFloat1 : 16.0D, this.b.t.q(), new jv(paramString, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2));
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {}
/* 38:   */   
/* 39:   */   public void a(dt paramdt)
/* 40:   */   {
/* 41:54 */     this.b.t().a(paramdt);
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void b(dt paramdt) {}
/* 45:   */   
/* 46:   */   public void a(String paramString, dt paramdt) {}
/* 47:   */   
/* 48:   */   public void a(ahd paramahd, int paramInt1, dt paramdt, int paramInt2)
/* 49:   */   {
/* 50:67 */     this.a.an().a(paramahd, paramdt.n(), paramdt.o(), paramdt.p(), 64.0D, this.b.t.q(), new jt(paramInt1, paramdt, paramInt2, false));
/* 51:   */   }
/* 52:   */   
/* 53:   */   public void a(int paramInt1, dt paramdt, int paramInt2)
/* 54:   */   {
/* 55:72 */     this.a.an().a(new jt(paramInt1, paramdt, paramInt2, true));
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void b(int paramInt1, dt paramdt, int paramInt2)
/* 59:   */   {
/* 60:77 */     for (qw localqw : this.a.an().e) {
/* 61:78 */       if ((localqw != null) && (localqw.o == this.b) && (localqw.F() != paramInt1))
/* 62:   */       {
/* 63:81 */         double d1 = paramdt.n() - localqw.s;
/* 64:82 */         double d2 = paramdt.o() - localqw.t;
/* 65:83 */         double d3 = paramdt.p() - localqw.u;
/* 66:85 */         if (d1 * d1 + d2 * d2 + d3 * d3 < 1024.0D) {
/* 67:86 */           localqw.a.a(new it(paramInt1, paramdt, paramInt2));
/* 68:   */         }
/* 69:   */       }
/* 70:   */     }
/* 71:   */   }
/* 72:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     qp
 * JD-Core Version:    0.7.0.1
 */